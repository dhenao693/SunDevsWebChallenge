package co.com.web.sundevs.cinemark.tasks.buys;

import co.com.web.sundevs.cinemark.interactions.ChooseSeatsNumber;
import co.com.web.sundevs.cinemark.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.web.sundevs.cinemark.userinterfaces.General.*;
import static co.com.web.sundevs.cinemark.userinterfaces.MovieInfo.*;
import static co.com.web.sundevs.cinemark.utils.Constants.USER_IN_MEMORY;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class BuyTicketsToMovie implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = actor.recall(USER_IN_MEMORY);
        actor.attemptsTo(
                Click.on(LST_CITY),
                Click.on(BTN_OPTION_FROM_LIST_2.of(user.getCity())),
                WaitUntil.the(IMG_LOADER, isNotVisible()),
                Click.on(BTN_SEE_SCHEDULES_FIRTS_MOVIE),
                WaitUntil.the(IMG_LOADER, isNotVisible()));
        actor.attemptsTo(
                Click.on(BTN_FIRTS_SCHEDULE),
                Click.on(BTN_CONFIRM_PURCHASE));
        actor.attemptsTo(
                Check.whether(BTN_CLOSE_PAYMENT_INFO_MODAL.isVisibleFor(actor))
                        .andIfSo(
                                Click.on(BTN_CLOSE_PAYMENT_INFO_MODAL)
                        ),
                ChooseSeatsNumber.toMovie(),
                Click.on(BTN_CONTINUE)
        );

        System.out.println();
    }

    public static BuyTicketsToMovie withCreditCard() {
        return Tasks.instrumented(BuyTicketsToMovie.class);
    }
}
