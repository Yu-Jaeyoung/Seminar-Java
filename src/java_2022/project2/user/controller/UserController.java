package java_2022.project2.user.controller;

import java_2022.project2.implement.enumeration.UserSelect;
import java_2022.project2.implement.userException.InvalidInputException;
import java_2022.project2.implement.userException.SameIdException;
import java_2022.project2.user.front.UserUI;
import java_2022.project2.user.repository.UserEntity;
import java_2022.project2.user.repository.UserRepository;

import java.io.IOException;
import java.io.Console;
import java.util.List;

public class UserController {

    private UserUI userUI;
    private UserRepository userRepository;

    private boolean logInSuccess = false;

    private final Console console = System.console();

    public void start() {
        userUI.welcomeUI();
    }

    private void signUpOrSignIn() throws IOException {
        while (!logInSuccess) {
            userUI.signUpOrSignInUI();
            try {
                switch (UserSelect.userSelect(console.readLine())) {
                    case SIGNUP -> signUp();
                    case LOGIN -> logInSuccess = signIn();
                }
            } catch (InvalidInputException e) {
                userUI.invalidInput();
            }
        }
    }

    private void signUp() throws IOException {
        List<UserEntity> userList = userRepository.getUserDB();

        userUI.signUpUI();

        try {
            userUI.inputId();
            String signUpId = console.readLine();

            userUI.inputPasswd();
            String signUpPassword = console.readLine();

            if (signUpId.equals("") || signUpPassword.equals("")) {
                throw new InvalidInputException();
            }

            if (signUpFilter(signUpId, userList)) {
                throw new SameIdException();
            }

            userRepository.add(new UserEntity(signUpId, signUpPassword));
            userUI.signUpSuccess();

        } catch (InvalidInputException e) {
            userUI.invalidInput();
        } catch (SameIdException e) {
            userUI.sameId();
        }
    }

    private boolean signIn() throws IOException {
        List<UserEntity> userList = userRepository.getUserDB();

        userUI.signInUI();

        userUI.inputId();
        String logInId = console.readLine();

        userUI.inputPasswd();
        String logInPassword = console.readLine();

        if (signInIdFilter(logInId, userList) && signInPasswdFilter(logInPassword, userList)) {
            userUI.signInSuccess();
            return true;
        }

        userUI.signInFail();
        return false;
    }

    private static boolean signUpFilter(final String Data, final List<UserEntity> userList) {
        for (UserEntity user : userList) {
            if (Data == user.getId())
                return true;
        }
        return false;
    }

    private static boolean signInIdFilter(final String Data, final List<UserEntity> userList) {
        for (UserEntity user : userList) {
            if (Data == user.getId())
                return true;
        }
        return false;
    }

    private static boolean signInPasswdFilter(final String Data, final List<UserEntity> userList) {
        for (UserEntity user : userList) {
            if (Data == user.getPassword())
                return true;
        }
        return false;
    }
}
