package co.com.web.sundevs.cinemark.interactions;

import co.com.web.sundevs.cinemark.models.User;
import io.cucumber.java.PendingException;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class FillFormJuridicPerson implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo();

        throw new PendingException();
    }

    public static FillFormJuridicPerson toRegister(User user) {
        return Tasks.instrumented(FillFormJuridicPerson.class, user);
    }
}
