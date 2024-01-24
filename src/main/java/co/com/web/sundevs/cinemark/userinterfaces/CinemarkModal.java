package co.com.web.sundevs.cinemark.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CinemarkModal {
    public static final Target CLOSE_POP_UP = Target.the("Close modal")
            .located(By.xpath("//*[@class='ant-modal-close-x']"));

}
