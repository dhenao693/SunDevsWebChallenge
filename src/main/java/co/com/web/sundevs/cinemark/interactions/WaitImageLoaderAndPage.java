package co.com.web.sundevs.cinemark.interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.web.sundevs.cinemark.userinterfaces.General.IMG_LOADER;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

@AllArgsConstructor
public class WaitImageLoaderAndPage implements Interaction {
    private int seconds;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(IMG_LOADER, isNotVisible()),
                WaitPage.aSeconds(seconds)
        );
    }

    public static WaitImageLoaderAndPage forSeconds(int seconds) {
        return Tasks.instrumented(WaitImageLoaderAndPage.class, seconds);
    }
}
