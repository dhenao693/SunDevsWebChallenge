package co.com.web.sundevs.cinemark.questions;

import lombok.NoArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.web.sundevs.cinemark.userinterfaces.ConfirmatiónPayment.IMG_QA_CODE;
import static co.com.web.sundevs.cinemark.userinterfaces.ConfirmatiónPayment.LBL_CONFIRMATION_CODE;

@NoArgsConstructor
public class ValidateConfirmationPayment implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LBL_CONFIRMATION_CODE.isVisibleFor(actor)&& IMG_QA_CODE.isVisibleFor(actor);
    }

    public static ValidateConfirmationPayment forMovie(){
        return new ValidateConfirmationPayment();
    }
}
