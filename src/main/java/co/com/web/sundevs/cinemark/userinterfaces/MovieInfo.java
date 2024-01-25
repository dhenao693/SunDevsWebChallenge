package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class MovieInfo {
    public static final Target LST_CITY = Target.the("")
            .located(xpath("//div[@class=\"jsx-2649583977 location-bar__select\"]"));

    public static final Target BTN_FIRTS_SCHEDULE = Target.the("")
            .located(xpath("(//div[@class=\"jsx-1092747776 theaters-detail__container \"]/div)[1]"));

    public static final Target BTN_SEE_SCHEDULES_MOVIE = Target.the("")
            .located(xpath("(//button[contains(text(),'ver horarios')])[3]"));

    public static final Target BTN_CONFIRM_PURCHASE = Target.the("")
            .located(xpath("//span[contains(text(),'CONFIRMAR')]/parent::button"));

    public static final Target BTN_CLOSE_PAYMENT_INFO_MODAL = Target.the("")
            .located(xpath("//i[@class=\"anticon anticon-close ant-modal-close-icon\"]"));


    public static final Target LST_SEATS = Target.the("")
            .located(xpath("//div[@class = 'select-seat-format ant-select ant-select-enabled']"));

}
