package co.com.web.sundevs.cinemark.models;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    private final String name;
    private final String lastName;
    private final String personType;
    private final String email;
    private final String phone;
    private final String address;
    private final String gender;
    private final String birthdate;
    private final String documentType;
    private final String documentNumber;
    private final String city;
    private final String preferredTheater;
    private final String password;
}
