package co.com.web.sundevs.cinemark.stepdefinitions;


import co.com.web.sundevs.cinemark.tasks.Start;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Hook {
    @Before
    public void initializer() {
        setTheStage(new OnlineCast());
        theActor("Default");
    }

    @Given("{string} is on cinemark page")
    public void danielIsOnCinemarkApp(String actorName) {
        theActorCalled(actorName).wasAbleTo(Start.browser());
    }
}
