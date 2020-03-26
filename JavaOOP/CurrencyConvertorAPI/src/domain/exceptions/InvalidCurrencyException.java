package domain.exceptions;

public class InvalidCurrencyException extends RuntimeException {

    private final String message;

    public InvalidCurrencyException(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
