package java_2022.ch10;

public class BalanceInsufficientException extends Exception {
    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}
