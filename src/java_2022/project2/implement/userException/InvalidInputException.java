package java_2022.project2.implement.userException;

public class InvalidInputException extends Exception{
    public InvalidInputException() {}

    public InvalidInputException(String message) {
        super(message); // 아직 이 super 부분의 의미는 모르겠다.
    }
}
