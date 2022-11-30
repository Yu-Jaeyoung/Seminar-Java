package project;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    final static User[] user = new User[10];

    public static void main(String[] args) {
        int selectNum;
        do {
            System.out.println("--------------------------------------------------------");
            System.out.println(" 1. Login 2. Create Account 3. Resign 4. Exit ");
            System.out.println("--------------------------------------------------------");
            System.out.println("Select > ");
            selectNum = scanner.nextInt();

            if (selectNum == 1) {

            } else if (selectNum == 2) {

            } else if (selectNum == 3) {

            }
        }
        while (selectNum != 4);

        scanner.close();

        System.out.println("Program End");

    }


    private static void createAccount() {
        int count = -1;

        for (int i = 0; i < user.length; i++) {
            if (user[i] == null)
                break;
            else {
                count++;
            }
        }

        if (count == user.length-1){
            System.out.println(" Account Full");
            return;
        }


    }
}