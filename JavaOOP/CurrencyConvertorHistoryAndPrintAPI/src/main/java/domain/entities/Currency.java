package domain.entities;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Currency {
    private BigDecimal value;
    private String currencyType;

    public Currency(BigDecimal value, String currencyType) {
        this.setValue(value);
        this.setCurrencyType(currencyType);
    }

    private void setValue(BigDecimal value) {
        if (value == null || value.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalStateException("value have to be a positive number!");
        }

        this.value = value;
    }

    private void setCurrencyType(String currencyType) {
        if (currencyType == null || currencyType.length() != 3) {
            throw new IllegalStateException("currency must be non-null string of size 3");
        }
        this.currencyType = currencyType;
    }

    public BigDecimal getValue() {
        return value;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String value = df.format(this.value);

        return String.format("%s %s",value,this.currencyType);
    }
}
