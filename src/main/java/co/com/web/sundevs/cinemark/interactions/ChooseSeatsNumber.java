package co.com.web.sundevs.cinemark.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;

import java.util.List;

import static co.com.web.sundevs.cinemark.userinterfaces.General.BTN_OPTION_FROM_LIST_3;
import static co.com.web.sundevs.cinemark.userinterfaces.MovieInfo.LST_SEATS;

public class ChooseSeatsNumber implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> seats = LST_SEATS.resolveAllFor(actor);
        for (WebElementFacade seat : seats) {
            actor.attemptsTo(Scroll.to(seat));
            seat.click();
            actor.attemptsTo(
                    Click.on(BTN_OPTION_FROM_LIST_3.of(String.valueOf(1)))
            );
            break;
        }
    }

    public static ChooseSeatsNumber toMovie() {
        return Tasks.instrumented(ChooseSeatsNumber.class);
    }
}
