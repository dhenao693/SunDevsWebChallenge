package co.com.web.sundevs.cinemark.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {
                "src/test/resources/features/create_account.feature",
                "src/test/resources/features/login.feature",
                "src/test/resources/features/shopping.feature"
        },
        glue = {"co/com/web/sundevs/cinemark/stepdefinitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CinemarkRunner {
}
