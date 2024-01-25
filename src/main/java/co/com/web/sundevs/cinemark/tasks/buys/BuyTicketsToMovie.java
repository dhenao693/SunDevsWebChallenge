package co.com.web.sundevs.cinemark.tasks.buys;

import co.com.web.sundevs.cinemark.interactions.ChooseSeatsNumber;
import co.com.web.sundevs.cinemark.interactions.FillPaymentForm;
import co.com.web.sundevs.cinemark.interactions.WaitImageLoaderAndPage;
import co.com.web.sundevs.cinemark.models.CreditCard;
import co.com.web.sundevs.cinemark.models.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.List;
import java.util.Map;

import static co.com.web.sundevs.cinemark.models.builders.CreditCardBuilder.selectCreditCardTypeApproved;
import static co.com.web.sundevs.cinemark.userinterfaces.CandyShop.BTN_ADD_FIRTS_FOOT;
import static co.com.web.sundevs.cinemark.userinterfaces.General.*;
import static co.com.web.sundevs.cinemark.userinterfaces.MovieInfo.*;
import static co.com.web.sundevs.cinemark.userinterfaces.SelectSeats.BTN_CONFIRM;
import static co.com.web.sundevs.cinemark.userinterfaces.SelectSeats.BTN_FIRTS_EMPTY_SEAT;
import static co.com.web.sundevs.cinemark.utils.Constants.CARD_IN_MEMORY;
import static co.com.web.sundevs.cinemark.utils.Constants.USER_IN_MEMORY;
import static co.com.web.sundevs.cinemark.utils.ConvertMapToModel.convertMapToCreditCard;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

@AllArgsConstructor
public class BuyTicketsToMovie implements Task {
    private List<Map<String, String>> creditCard;

    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = actor.recall(USER_IN_MEMORY);
        CreditCard creditCard1 = selectCreditCardTypeApproved(convertMapToCreditCard(creditCard.get(0)));
        actor.remember(CARD_IN_MEMORY, creditCard1);

        actor.attemptsTo(
                Click.on(LST_CITY),
                Click.on(BTN_OPTION_FROM_LIST_2.of(user.getCity()))
        );

        actor.attemptsTo(WaitImageLoaderAndPage.forSeconds(3));

        actor.attemptsTo(
                Click.on(BTN_SEE_SCHEDULES_MOVIE),
                WaitUntil.the(IMG_LOADER, isNotVisible()),
                Click.on(BTN_FIRTS_SCHEDULE),
                Click.on(BTN_CONFIRM_PURCHASE));

        actor.attemptsTo(WaitImageLoaderAndPage.forSeconds(5));

        actor.attemptsTo(
                Check.whether(BTN_CLOSE_PAYMENT_INFO_MODAL.isVisibleFor(actor))
                        .andIfSo(
                                Click.on(BTN_CLOSE_PAYMENT_INFO_MODAL)
                        ));

        actor.attemptsTo(
                ChooseSeatsNumber.toMovie(),
                Click.on(BTN_CONTINUE)
        );
        actor.attemptsTo(WaitImageLoaderAndPage.forSeconds(5));

        actor.attemptsTo(
                Click.on(BTN_FIRTS_EMPTY_SEAT),
                Click.on(BTN_CONTINUE)
        );

        actor.attemptsTo(WaitImageLoaderAndPage.forSeconds(5));

        actor.attemptsTo(Click.on(BTN_CONFIRM));

        actor.attemptsTo(WaitImageLoaderAndPage.forSeconds(5));

        actor.attemptsTo(
                Click.on(BTN_ADD_FIRTS_FOOT),
                Click.on(BTN_CONTINUE)
        );

        actor.attemptsTo(WaitImageLoaderAndPage.forSeconds(5));

        actor.attemptsTo(
                Click.on(BTN_CONTINUE));


        actor.attemptsTo(WaitImageLoaderAndPage.forSeconds(5));

        actor.attemptsTo(FillPaymentForm.withCard(creditCard1));

        System.out.println();
    }

    public static BuyTicketsToMovie withCreditCard(List<Map<String, String>> creditCard) {
        return Tasks.instrumented(BuyTicketsToMovie.class, creditCard);
    }
}
