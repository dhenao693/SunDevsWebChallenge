package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import static co.com.web.sundevs.cinemark.utils.Constants.URL_HOME;

@DefaultUrl(URL_HOME)
public class CinemarkHome extends PageObject {


    public static final Target BTN_LOGIN = Target.the("")
            .located(By.xpath("(//*[@title='INICIAR SESIÓN'])[1]"));

    public static final Target BTN_REGISTER = Target.the("")
            .located(By.xpath("(//*[@title='CREAR CUENTA'])[1]"));

}