package java_2022.project2;

import java_2022.project2.user.controller.UserController;


public class Main {

    public static void main(String[] args) {
        UserController userController = new UserController();

        userController.start();
    }
}
