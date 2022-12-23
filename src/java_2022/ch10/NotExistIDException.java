package java_2022.ch10;

public class NotExistIDException extends Exception {
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
            super(message);
    }
}
