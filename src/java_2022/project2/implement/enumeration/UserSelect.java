package java_2022.project2.implement.enumeration;

import java_2022.project2.implement.userException.InvalidInputException;

public enum UserSelect {
    SIGNUP,
    LOGIN;

    public static UserSelect userSelect (final String s) throws InvalidInputException {
        UserSelect userSelect = switch (s) {
            case "1" -> {
                yield SIGNUP;
            }
            case "2" -> {
                yield LOGIN;
            }
            default -> throw new InvalidInputException("1또는 2만 입력 가능합니다.");
        };
        return userSelect;
    }
}
