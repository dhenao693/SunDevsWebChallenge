package co.com.web.sundevs.cinemark.stepdefinitions;

import co.com.web.sundevs.cinemark.questions.ValidateRegister;
import co.com.web.sundevs.cinemark.tasks.register.RegisterUser;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Register {
    @When("he registers in the app")
    public void registerInApp(List <Map<String,String>> users) {
        theActorInTheSpotlight().attemptsTo(
                RegisterUser.inApp(users)
        );
    }

    @Then("see register confirmation")
    public void seeRegisterConfirmation() {
        theActorInTheSpotlight().should(
                seeThat(ValidateRegister.successful())
        );
    }
}
