package co.com.web.sundevs.cinemark.tasks.register;

import co.com.web.sundevs.cinemark.interactions.FillFormJuridicPerson;
import co.com.web.sundevs.cinemark.interactions.FillFormNaturalPerson;
import co.com.web.sundevs.cinemark.models.User;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;

import java.util.List;
import java.util.Map;

import static co.com.web.sundevs.cinemark.userinterfaces.CinemarkHome.BTN_REGISTER;
import static co.com.web.sundevs.cinemark.userinterfaces.MemberModal.WITHOUT_MEMBER;
import static co.com.web.sundevs.cinemark.userinterfaces.General.BTN_OPTION_FROM_LIST_1;
import static co.com.web.sundevs.cinemark.userinterfaces.Register.LST_PERSON_TYPE;
import static co.com.web.sundevs.cinemark.utils.Constants.USER_IN_MEMORY;
import static co.com.web.sundevs.cinemark.utils.ConvertMapToModel.convertMapToUser;


@AllArgsConstructor
public class RegisterUser implements Task {
    private List<Map<String, String>> users;

    @Override
    public <T extends Actor> void performAs(T actor) {
        User user = convertMapToUser(users.get(0));
        actor.remember(USER_IN_MEMORY.toString(),user);
        actor.attemptsTo(
                Click.on(BTN_REGISTER),
                Click.on(WITHOUT_MEMBER),
                Click.on(LST_PERSON_TYPE),
                Click.on(BTN_OPTION_FROM_LIST_1.of(user.getPersonType())),
                Check.whether(user.getPersonType().equals("Natural"))
                        .andIfSo(
                                FillFormNaturalPerson.toRegister(user)
                        )
                        .otherwise(
                                FillFormJuridicPerson.toRegister(user)
                        )
                        );
    }

    public static RegisterUser inApp(List<Map<String, String>> users) {
        return Tasks.instrumented(RegisterUser.class, users);
    }
}
