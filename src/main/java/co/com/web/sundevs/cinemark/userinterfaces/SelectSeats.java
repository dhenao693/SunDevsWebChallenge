package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import static org.openqa.selenium.By.xpath;

public class SelectSeats {
    public static final Target BTN_FIRTS_EMPTY_SEAT = Target.the("")
            .located(xpath("(//button[contains(@class,'seat-item--Empty')])[1]"));

    public static final Target BTN_CONFIRM = Target.the("")
            .located(xpath("//button[contains(@title,'confirmar')]"));
    public static final Target BTN_CONTINUE = Target.the("")
            .located(xpath("//button[contains(@title,'continuar')]"));

}
