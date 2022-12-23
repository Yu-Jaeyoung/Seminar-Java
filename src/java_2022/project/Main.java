package java_2022.project;

import java.util.Scanner;

public class Main {

    final static Scanner scanner = new Scanner(System.in);
    final static Login login = new Login();
    static VectorListMenu VLM = new VectorListMenu(); // 객체 생성시 이름 다 알아볼 수 있게 작성

    public static void main(String[] args) throws Exception {

        int selectNum;
        //while 문
        do {
            System.out.println("--------------------------------------------------------");
            System.out.println(" 1. Login 2. Create Account 3. Resign 4. Exit ");
            System.out.println("--------------------------------------------------------");
            System.out.print("Select > ");
            selectNum = scanner.nextInt();

            if (selectNum == 1) {
                if (login.accessLogin()) {
                    VLM.pickMenu();
                    VLM.payment();
                }
            } else if (selectNum == 2) {
                login.createAccount();
            } else if (selectNum == 3) {
                login.deleteAccount();
            }
        }
        while (selectNum != 4);

        scanner.close();

        System.out.println("Program End");

    }
}
