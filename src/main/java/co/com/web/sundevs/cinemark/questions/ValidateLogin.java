package co.com.web.sundevs.cinemark.questions;

import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.web.sundevs.cinemark.userinterfaces.LoginModal.LBL_USERNAME;

@NoArgsConstructor
public class ValidateLogin implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(LBL_USERNAME).answeredBy(actor);
    }

    public static ValidateLogin User(){
        return new ValidateLogin();
    }
}
