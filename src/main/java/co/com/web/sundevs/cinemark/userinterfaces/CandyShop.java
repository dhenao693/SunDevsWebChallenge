package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class CandyShop {
    public static final Target BTN_ADD_FIRTS_FOOT= Target.the("")
            .located(xpath("(//img[contains(@alt,'Add')]/parent::span/parent::button)[1]"));
}
