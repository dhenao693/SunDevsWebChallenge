package co.com.web.sundevs.cinemark.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

import static co.com.web.sundevs.cinemark.userinterfaces.MovieInfo.LST_SEATS;
import static co.com.web.sundevs.cinemark.userinterfaces.General.BTN_OPTION_FROM_LIST_1;

public class ChooseSeatsNumber implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> seats = LST_SEATS.resolveAllFor(actor);
        int count = 1;
        for (WebElementFacade seat : seats) {
            seat.click();
            actor.attemptsTo(
                    Click.on(BTN_OPTION_FROM_LIST_1.of(String.valueOf(count)))
            );
            count++;
        }
    }

    public static ChooseSeatsNumber toMovie(){
        return Tasks.instrumented(ChooseSeatsNumber.class);
    }
}
