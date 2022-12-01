package project;

import java.util.Scanner;

public class Main {
    int i = 0;
    final static Scanner scanner = new Scanner(System.in);
    final static User[] user = new User[10];

    public static void main(String[] args) {
        int selectNum;
        do {
            System.out.println("--------------------------------------------------------");
            System.out.println(" 1. Login 2. Create Account 3. Resign 4. Exit ");
            System.out.println("--------------------------------------------------------");
            System.out.print("Select > ");
            selectNum = scanner.nextInt();

            if (selectNum == 1) {
                accessLogin();
            } else if (selectNum == 2) {
                createAccount();
            } else if (selectNum == 3) {
                deleteAccount();
            }
        }
        while (selectNum != 4);

        scanner.close();

        System.out.println("Program End");

    }


    private static void createAccount() {
        int count = 0, i = 0;

        for (; i < user.length; i++) {
            if (user[i] == null) {
                break;
            } else {
                count++;
            }
        }

        if (count == user.length) {
            System.out.println(" Account Full");
            return;
        }

        String id, idforcheck, password, nickname;

        System.out.print("ID : ");
        id = scanner.next();

        for (; i < user.length; i++) {
            if (user[i] != null) {
                idforcheck = user[i].getId();
                System.out.println(idforcheck);
                if (id.equals(idforcheck)) {
                    System.out.println(" !! Same ID Detected !! ");
                    return;
                }
            }

        }

        System.out.print("Password : ");
        password = scanner.next();

        System.out.print("NickName : ");
        nickname = scanner.next();

        user[count] = new User(id, password, nickname);

        System.out.println(user[count].getId() + " " + user[count].getPassword() + " " + user[count].getNickName());
        System.out.println(count);
    }

    private static void deleteAccount() {
        int i = 0;

        String id, password;

        System.out.print("ID : ");
        id = scanner.next();

        System.out.print("Password : ");
        password = scanner.next();

        for (; i < user.length; i++) {
            try {
                if (id.equals(user[i].getId()) && (password.equals(user[i].getPassword()))) {
                    user[i] = null;
                    System.out.println(" !! Resigned !! ");
                    return;
                }
            } catch (NullPointerException e) {

            }
        }

    }

    private static void accessLogin() {
        int i = 0;

        String id, password;
        System.out.print("ID : ");
        id = scanner.next();

        System.out.print("Password : ");
        password = scanner.next();

        for (; i < user.length; i++) {
            try {


                if (id.equals(user[i].getId()) && (password.equals(user[i].getPassword()))) {
                    System.out.println("Welcome " + user[i].getNickName() + ".");
                    return;
                }
            } catch (NullPointerException e) {

            }
        }

        System.out.println("Login failed");
    }
}