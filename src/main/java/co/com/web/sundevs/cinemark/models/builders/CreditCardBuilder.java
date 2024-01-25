package co.com.web.sundevs.cinemark.models.builders;

import co.com.web.sundevs.cinemark.models.CreditCard;

public class CreditCardBuilder {
    private static final String CVV_DEFAULT = "777";
    private static final String CVV_AMEX_DEFAULT = "7777";
    private static final String EXPIRATION_DATE_DEFAULT = "05/2025";
    private static final String APPROVED_NAME = "APPROVED";
    private static final String REJECTED_NAME = "REJECTED";

    public static CreditCard defaultCreditCard(CreditCard creditCard) {
        return CreditCard.builder()
                .number(creditCard.getNumber())
                .name(APPROVED_NAME)
                .expirationDate(EXPIRATION_DATE_DEFAULT)
                .cvv(CVV_DEFAULT)
                .type(creditCard.getType())
                .installments(creditCard.getInstallments())
                .country(creditCard.getCountry())
                .build();
    }

    public static CreditCard defaultAmexCreditCard(CreditCard creditCard) {
        return CreditCard.builder()
                .number(creditCard.getNumber())
                .name(APPROVED_NAME)
                .expirationDate(EXPIRATION_DATE_DEFAULT)
                .cvv(CVV_AMEX_DEFAULT)
                .type(creditCard.getType())
                .installments(creditCard.getInstallments())
                .country(creditCard.getCountry())
                .build();
    }

    public static CreditCard selectCreditCardTypeApproved(CreditCard creditCard) {
        return ("AMEX".equalsIgnoreCase(creditCard.getType())) ? defaultAmexCreditCard(creditCard) : defaultCreditCard(creditCard);
    }
}
