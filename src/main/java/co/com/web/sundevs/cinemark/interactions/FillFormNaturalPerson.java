package co.com.web.sundevs.cinemark.interactions;

import co.com.web.sundevs.cinemark.models.User;
import co.com.web.sundevs.cinemark.userinterfaces.General;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.web.sundevs.cinemark.userinterfaces.Register.*;


@AllArgsConstructor
public class FillFormNaturalPerson implements Interaction {
    private User user;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LST_DOCUMENT_TYPE),
                Click.on(General.BTN_OPTION_FROM_LIST_1.of(user.getDocumentType())),
                Enter.theValue(user.getName()).into(LBL_NAME),
                Enter.theValue(user.getLastName()).into(LBL_LASTNAME),
                Click.on(LST_GENDER),
                Click.on(General.BTN_OPTION_FROM_LIST_1.of(user.getGender())),
                Enter.theValue(user.getDocumentNumber()).into(LBL_DOCUMENT_NUMBER),
                SelectBirthdate.of(user.getBirthdate()),
                Enter.theValue(user.getPhone()).into(LBL_PHONE),
                Enter.theValue(user.getAddress()).into(LBL_ADDRESS),
                Scroll.to(BTN_ACCEPT_TERMS),
                Enter.theValue(user.getEmail()).into(LBL_EMAIL),
                Enter.theValue(user.getEmail()).into(LBL_RETRY_EMAIL),
                Enter.theValue(user.getPassword()).into(LBL_PASSWORD),
                Enter.theValue(user.getPassword()).into(LBL_RETRY_PASSWORD),
                Click.on(LST_CITY),
                Click.on(General.BTN_OPTION_FROM_LIST_1.of(user.getCity())),
                Click.on(LST_PREFERRED_THEATER),
                Click.on(General.BTN_OPTION_FROM_LIST_1.of(user.getPreferredTheater())),
                Click.on(BTN_ACCEPT_TERMS),
                Click.on(BTN_CREATE_ACCOUNT)
        );

    }

    public static FillFormNaturalPerson toRegister(User user) {
        return Tasks.instrumented(FillFormNaturalPerson.class, user);
    }
}
