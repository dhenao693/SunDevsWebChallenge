package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class LoginModal {
    public static final Target LBL_USER = Target.the("")
            .located(id("MemberEmail"));
    public static final Target LBL_PASSSWORD = Target.the("")
            .located(id("MemberPassword"));
    public static final Target BTN_START_LOGIN = Target.the("")
            .located(xpath("//*[@title='Ingresar']"));
    public static final Target LBL_USERNAME = Target.the("")
            .located(xpath("//*[contains(@class,'user-name')]"));



}
