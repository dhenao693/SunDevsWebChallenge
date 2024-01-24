package co.com.web.sundevs.cinemark.stepdefinitions;

import co.com.web.sundevs.cinemark.models.User;
import co.com.web.sundevs.cinemark.questions.ValidateLogin;
import co.com.web.sundevs.cinemark.tasks.login.LoginUser;
import co.com.web.sundevs.cinemark.utils.UserUtil;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static co.com.web.sundevs.cinemark.utils.Constants.USER_IN_MEMORY;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class Login {

    @When("he login in app")
    public void registerInApp(List<Map<String, String>> users) {
        theActorInTheSpotlight().attemptsTo(
                LoginUser.inApp(users)
        );
    }

    @Then("see the correct email")
    public void seeEmail() {
        User user = theActorInTheSpotlight().recall(USER_IN_MEMORY);
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateLogin.User(), equalTo(UserUtil.createUserName(user))));
    }
}
