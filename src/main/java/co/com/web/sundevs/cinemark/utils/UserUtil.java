package co.com.web.sundevs.cinemark.utils;

import co.com.web.sundevs.cinemark.models.User;

public class UserUtil {
    public static String createUserName(User user){
        return String.format("%s %s",user.getName(),user.getLastName());
    }
}
