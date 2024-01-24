package co.com.web.sundevs.cinemark.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.web.sundevs.cinemark.userinterfaces.SuccessfulRegister.LBL_SUCCESSFUL_REGISTER;

public class ValidateRegister implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return LBL_SUCCESSFUL_REGISTER.isVisibleFor(actor);
    }

    public static ValidateRegister successful(){
        return new ValidateRegister();
    }
}
