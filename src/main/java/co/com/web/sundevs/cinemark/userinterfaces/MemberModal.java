package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class MemberModal {
    public static final Target WITHOUT_MEMBER = Target.the("")
            .located(xpath("//*[contains(text(),'CREAR CUENTA SIN MEMBRESÍA')]//parent::button"));

}