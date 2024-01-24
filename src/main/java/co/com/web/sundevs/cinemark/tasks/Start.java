package co.com.web.sundevs.cinemark.tasks;

import co.com.web.sundevs.cinemark.userinterfaces.CinemarkHome;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.waits.WaitWithTimeout;

import static co.com.web.sundevs.cinemark.userinterfaces.CinemarkModal.CLOSE_POP_UP;

public class Start implements Task {
    CinemarkHome cinemarkHome;

    public static Start browser() {
        return Tasks.instrumented(Start.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(cinemarkHome),
                WaitUntil.angularRequestsHaveFinished()
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Check.whether(CLOSE_POP_UP.isVisibleFor(actor))
                .andIfSo(Click.on(CLOSE_POP_UP)));
    }
}
