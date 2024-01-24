package co.com.web.sundevs.cinemark.interactions;

import co.com.web.sundevs.cinemark.userinterfaces.Register;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeysIntoTarget;
import org.openqa.selenium.Keys;

import static co.com.web.sundevs.cinemark.userinterfaces.Register.*;
import static org.openqa.selenium.Keys.ENTER;


@AllArgsConstructor
public class SelectBirthdate implements Interaction {
    private String date;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_BIRTHDATE),
                Enter.theValue(date).into(LBL_DATE)
        );
    }

    public static SelectBirthdate of(String date){
        return Tasks.instrumented(SelectBirthdate.class,date);
    }
}
