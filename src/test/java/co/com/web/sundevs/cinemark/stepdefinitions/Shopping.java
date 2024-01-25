package co.com.web.sundevs.cinemark.stepdefinitions;


import co.com.web.sundevs.cinemark.questions.ValidateConfirmationPayment;
import co.com.web.sundevs.cinemark.tasks.buys.BuyTicketsToMovie;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Shopping {
    @When("he buys some seats to the movie")
    public void buySeatsToMovie (List<Map<String,String>> creditCard) {
        theActorInTheSpotlight().attemptsTo(
                BuyTicketsToMovie.withCreditCard(creditCard)
        );
    }

    @Then("see the confirmation payment")
    public void seeConfirmationPayment () {
        theActorInTheSpotlight().should(seeThat(ValidateConfirmationPayment.forMovie()));
    }
}
