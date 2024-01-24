package co.com.web.sundevs.cinemark.stepdefinitions;


import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Shopping {
    @When("he buys some seats for the movie")
    public void buySeats () {
        theActorInTheSpotlight().attemptsTo(
               // GoToProfile.inApp()
        );
    }

}
