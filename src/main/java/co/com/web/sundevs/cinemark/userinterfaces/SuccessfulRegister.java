package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class SuccessfulRegister {
    public static final Target LBL_SUCCESSFUL_REGISTER = Target.the("")
            .located(xpath("//h3[contains(text(),'Registro exitoso')]"));
}
