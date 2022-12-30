package java_2022.project2.implement.userException;

public class SameIdException extends Exception{
    public SameIdException() {}

    public SameIdException(String message) {
        super(message);
    }
}
