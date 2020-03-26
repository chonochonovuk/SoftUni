package external;


import domain.exceptions.InvalidCurrencyException;
import domain.external.CurrencyValidator;


public class CurrencyValidatorImpl implements CurrencyValidator {


    public CurrencyValidatorImpl() {

    }

    @Override
    public void validate(String currency) throws InvalidCurrencyException {

        if (currency.length() != 3) {
            throw new InvalidCurrencyException("Currency must consist of 3 uppercase letters!!!");

        }

        for (int i = 0; i < currency.length(); i++) {
            if (!Character.isUpperCase(currency.charAt(i))){
                throw new InvalidCurrencyException("Currency must consist of 3 uppercase letters!!!");
            }
        }

    }

}
