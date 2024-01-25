package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class ConfirmatiónPayment {
    public static final Target LBL_CONFIRMATION_CODE = Target.the("")
            .located(xpath("//h4[contains(text(),'código de confirmación')]"));

    public static final Target IMG_QA_CODE = Target.the("")
            .located(xpath(" //div[contains(@class,\"information-order\")]/div"));


}
