package co.com.web.sundevs.cinemark.stepdefinitions;


import co.com.web.sundevs.cinemark.tasks.buys.BuyTicketsToMovie;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Shopping {
    @When("he buys some seats to the movie")
    public void buySeatsToMovie () {
        theActorInTheSpotlight().attemptsTo(
                BuyTicketsToMovie.withCreditCard()
        );
    }

}
