package co.com.web.sundevs.cinemark.models;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@Builder
public class CreditCard {
    private final String number;
    private final String name;
    private final String expirationDate;
    private final String cvv;
    private final String installments;
    private final String type;
    private final String country;

}
