package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class General {
    public static final Target BTN_CONTINUE = Target.the("")
            .located(xpath("//span[contains(text(),'continuar')]/parent::button"));
    public static final Target BTN_OPTION_FROM_LIST_1 = Target.the("")
            .locatedBy("//*[contains(text(),'{0}')]");
    public static final Target BTN_OPTION_FROM_LIST_2 = Target.the("")
            .locatedBy("//h2[contains(text(),'{0}')]");
    public static final Target IMG_LOADER = Target.the("")
            .locatedBy("//img[@class=\"jsx-1335273743 loader-box\"]");

}
