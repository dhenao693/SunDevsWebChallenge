package co.com.web.sundevs.cinemark.interactions;

import co.com.web.sundevs.cinemark.models.CreditCard;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.web.sundevs.cinemark.userinterfaces.General.BTN_ACCEPT;
import static co.com.web.sundevs.cinemark.userinterfaces.General.BTN_CONTINUE;
import static co.com.web.sundevs.cinemark.userinterfaces.Payment.*;

@AllArgsConstructor
public class FillPaymentForm implements Interaction {
    private CreditCard creditCard;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CREDIT_CARD_PAYMENT));
        actor.attemptsTo(
                Enter.theValue(creditCard.getNumber()).into(LBL_CARD_NUMBER));
        actor.attemptsTo(Enter.theValue(creditCard.getName()).into(LBL_CARD_NAME));
        actor.attemptsTo(
                Scroll.to(CHK_PAYMEENT_AGREEMENT),
                Click.on(LBL_EXPIRATION_DATE),
                Click.on(BTN_NEXT_YEAR_CALENDAR),
                Click.on(BTN_MOUNTH)
        );

        actor.attemptsTo(Enter.theValue(creditCard.getCvv()).into(LBL_CVV));
        actor.attemptsTo(
                Scroll.to(CHK_PAYMEENT_AGREEMENT),
                Click.on(LBL_INSTALLMENTS),
                Click.on(LBL_INSTALLMENTS_NUMBER.of(creditCard.getInstallments()))
        );

        actor.attemptsTo(
                Scroll.to(CHK_PAYMEENT_AGREEMENT),
                Click.on(CHK_PAYMEENT_AGREEMENT)
        );

        actor.attemptsTo(Click.on(BTN_CONTINUE));
        actor.attemptsTo(Click.on(BTN_ACCEPT));

        actor.attemptsTo(WaitImageLoaderAndPage.forSeconds(5));
        System.out.println();
    }

    public static FillPaymentForm withCard(CreditCard creditCard) {
        return Tasks.instrumented(FillPaymentForm.class, creditCard);
    }
}
