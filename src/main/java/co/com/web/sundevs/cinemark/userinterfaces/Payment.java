package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Payment {

    public static final Target BTN_CREDIT_CARD_PAYMENT = Target.the("")
            .located(xpath("//span[contains(text(),'AGREGAR TARJETA DE CRÉDITO/DEBITO')]/parent::div"));
    public static final Target LBL_CARD_NUMBER = Target.the("")
            .located(id("payment_creditCard.number"));
    public static final Target LBL_CARD_NAME = Target.the("")
            .located(id("payment_creditCard.name"));
    public static final Target LBL_EXPIRATION_DATE = Target.the("")
            .located(id("payment_creditCard.expirationDate"));
    public static final Target BTN_NEXT_YEAR_CALENDAR = Target.the("")
            .located(xpath("//a[@title=\"Next year (Control + right)\" and @role = 'button'] "));
    public static final Target BTN_MOUNTH = Target.the("")
            .located(xpath("//*[text()=\"may.\"]"));
    public static final Target LBL_CVV = Target.the("")
            .located(id("payment_creditCard.securityCode"));

    public static final Target LBL_INSTALLMENTS = Target.the("")
            .located(id("payment_creditCard.installments"));

    public static final Target LBL_INSTALLMENTS_NUMBER = Target.the("")
            .locatedBy("//li[text()=\"{0}\"]");

    public static final Target CHK_PAYMEENT_AGREEMENT = Target.the("")
            .located(id("payment_agreement"));
}
