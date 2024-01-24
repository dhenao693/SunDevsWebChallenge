package co.com.web.sundevs.cinemark.tasks.login;

import co.com.web.sundevs.cinemark.models.User;
import co.com.web.sundevs.cinemark.userinterfaces.LoginModal;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;
import java.util.Map;

import static co.com.web.sundevs.cinemark.userinterfaces.CinemarkHome.BTN_LOGIN;
import static co.com.web.sundevs.cinemark.userinterfaces.LoginModal.BTN_START_LOGIN;
import static co.com.web.sundevs.cinemark.utils.Constants.USER_IN_MEMORY;
import static co.com.web.sundevs.cinemark.utils.ConvertMapToModel.convertMapToUser;

@AllArgsConstructor
public class LoginUser implements Task {
    private List<Map<String, String>> users;
    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = convertMapToUser(users.get(0));
        actor.remember(USER_IN_MEMORY.toString(),user);
        actor.attemptsTo(
                Click.on(BTN_LOGIN),
                Enter.theValue(user.getEmail()).into(LoginModal.LBL_USER),
                Enter.theValue(user.getPassword()).into(LoginModal.LBL_PASSSWORD),
                Click.on(BTN_START_LOGIN)
        );
    }

    public static LoginUser inApp(List<Map<String, String>> users) {
        return Tasks.instrumented(LoginUser.class, users);
    }
}
