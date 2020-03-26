package domain.entities;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Money {

    private final BigDecimal value;
    private final String currency;

    public Money(BigDecimal value, String currency) {
        this.value = value;
        this.currency = currency;
        this.validate();
    }

    private void validate() {

        List<String> invalidFields = new ArrayList<>();

        if (this.value == null || this.value.compareTo(BigDecimal.ZERO) <= 0) {
            invalidFields.add("value must be non-null non-negative!");
        }
        if (this.currency == null || this.currency.length() != 3) {
            invalidFields.add("currency must be non-null string of size 3");
        }

        if (!invalidFields.isEmpty()) {
            throw new IllegalArgumentException("Invalid fields " + invalidFields);
        }
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String value = df.format(this.value);


        return String.format("You get " +
                "%s " +
                "%s",value,this.currency);
    }
}
