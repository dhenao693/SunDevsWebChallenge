package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.id;
import static org.openqa.selenium.By.xpath;

public class Register {
    public static final Target LST_PERSON_TYPE = Target.the("")
            .located(xpath("//div[@id='register_EducationLevel']/div/div"));
    public static final Target LST_DOCUMENT_TYPE = Target.the("")
            .located(xpath("//div[@id='register_HouseholdIncome']/div/div"));
    public static final Target LBL_NAME = Target.the("")
            .located(id("register_FirstName"));
    public static final Target LBL_LASTNAME = Target.the("")
            .located(id("register_LastName"));
    public static final Target LST_GENDER = Target.the("")
            .located(xpath("//div[@id='register_Gender']/div/div"));
    public static final Target LBL_DOCUMENT_NUMBER = Target.the("")
            .located(id("register_NationalID"));
    public static final Target LBL_PHONE = Target.the("")
            .located(id("register_MobilePhone"));
    public static final Target LBL_ADDRESS = Target.the("")
            .located(id("register_Address1"));
    public static final Target LBL_EMAIL = Target.the("")
            .located(id("register_Email"));
    public static final Target LBL_RETRY_EMAIL = Target.the("")
            .located(id("register_confirmEmail"));
    public static final Target LBL_PASSWORD = Target.the("")
            .located(id("register_Password"));
    public static final Target LBL_RETRY_PASSWORD = Target.the("")
            .located(id("register_confirmPassword"));
    public static final Target LST_CITY = Target.the("")
            .located(xpath("//div[@id='register_PreferredComplexCity']/div/div"));
    public static final Target BTN_BIRTHDATE = Target.the("")
            .located(id("register_birthDay"));
    public static final Target LBL_DATE = Target.the("")
            .located(xpath("//input[@class='ant-calendar-input ']"));
    public static final Target LST_PREFERRED_THEATER = Target.the("")
            .located(xpath("//div[@id='register_PreferredComplex']/div/div"));
    public static final Target BTN_ACCEPT_TERMS = Target.the("")
            .located(id("register_termines"));
    public static final Target BTN_CREATE_ACCOUNT = Target.the("")
            .located(xpath("//*[@title='Crear cuenta']"));
}
