package domain.commandInterpreter;

import domain.entities.Currency;

public class CurrencyConvertor implements ConvertCurrency {
    private Currency from;
    private String to;

    public CurrencyConvertor(Currency from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Currency convert() {

        return null;
    }
}
