package co.com.web.sundevs.cinemark.questions;

import co.com.web.sundevs.cinemark.interactions.WaitPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.web.sundevs.cinemark.userinterfaces.SuccessfulRegister.LBL_SUCCESSFUL_REGISTER;

public class ValidateRegister implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(WaitPage.aSeconds(5));
        return LBL_SUCCESSFUL_REGISTER.isVisibleFor(actor);
    }

    public static ValidateRegister successful(){
        return new ValidateRegister();
    }
}
