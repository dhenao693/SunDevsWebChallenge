package co.com.web.sundevs.cinemark.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Register {
    @When("he registers in the app")
    public void registerInApp(List <Map<String,String>> users) {
        theActorInTheSpotlight().attemptsTo(
                //RegisterUser.inApp(users)
        );
    }

    @Then("see register confirmation")
    public void seeRegisterConfirmation() {
        theActorInTheSpotlight().should(
                //GivenWhenThen.seeThat(true,true)
        );
    }
}
