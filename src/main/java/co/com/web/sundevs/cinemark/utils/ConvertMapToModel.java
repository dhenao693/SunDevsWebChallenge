package co.com.web.sundevs.cinemark.utils;

import co.com.web.sundevs.cinemark.models.CreditCard;
import co.com.web.sundevs.cinemark.models.User;

import java.util.Map;

public class ConvertMapToModel {
    public static User convertMapToUser(Map<String, String> map) {
        return User.builder()
                .name(map.get("name"))
                .lastName(map.get("lastName"))
                .personType(map.get("personType"))
                .email(map.get("email"))
                .phone(map.get("phone"))
                .address(map.get("address"))
                .gender(map.get("gender"))
                .birthdate(map.get("birthdate"))
                .documentType(map.get("documentType"))
                .documentNumber(map.get("documentNumber"))
                .city(map.get("city"))
                .preferredTheater(map.get("preferredTheater"))
                .password(map.get("password"))
                .build();

    }

    public static CreditCard convertMapToCreditCard(Map<String, String> map) {
        return CreditCard.builder()
                .number(map.get("number"))
                .type(map.get("type"))
                .country(map.get("country"))
                .installments(map.get("installments"))
                .build();

    }
}
