package java_2022.project;

import java.util.Scanner;

public class Login {
    final static User[] user = new User[10];
    final static Scanner scanner = new Scanner(System.in);

    protected void createAccount() {
        int count = -1, i = 0;

        for (; i < user.length; i++) {
            if (user[i] == null) {
                break;
            } else {
                count++;
            }
        }

        if (count == user.length - 1) {
            System.out.println("Can't Create New Account");
            return;
            //10개의 계정이 가득 찬 상태
            //메소드 실행 강제 종료
        }

        String id, password, nickname;

        System.out.print("ID : ");
        id = scanner.next();

        boolean check;
        check = overlapIdCheck(id);
        if (!check) {
            System.out.println("Overlap Id found");
            count--;
            return;
        }

        System.out.print("Password : ");
        password = scanner.next();

        System.out.print("NickName : ");
        nickname = scanner.next();

        User newUser = new User(id, password, nickname);


        for (; i < user.length; i++) {
            if (user[i] == null) {
                user[i] = newUser;
                System.out.println("Create Success");
                break;
            }
        }
    }

    protected boolean accessLogin() {
        int i = 0;

        String id, password;
        System.out.print("ID : ");
        id = scanner.next();

        System.out.print("Password : ");
        password = scanner.next();

        boolean check;
        check = matchUser(id, password);

        if (check) {
            System.out.println("Login succeed");
            System.out.println("Welcome " + user[userNum(id)].getNickName() + ".");
            System.out.println();
            return true;
        } else {
            System.out.println("Login failed");
            return false;
        }
    }


    //탈퇴
    protected void deleteAccount() {

        System.out.print(" ID : ");
        String id = scanner.next();
        System.out.print(" Password : ");
        String password = scanner.next();
        System.out.println();

        for (int i = 0; i < user.length; i++) {
            if (user[i] != null) {
                if (user[i].getId().equals(id) && user[i].getPassword().equals(password)) {
                    user[i] = null;
                    System.out.println(" !! Resigned !! ");
                    System.out.println();
                    return; //이 상황에선 탈퇴 메소드 종료
                }
            }
        }
        System.out.println("Resign failed");
    }

    //로그인용 메소드
    //userArray 배열에서 id,password 와 동일한 userArray 배열 찾기
    private boolean matchUser(String id, String password) {
        for (int i = 0; i < user.length; i++) {
            if (user[i] != null) {
                String newId = user[i].getId();
                String newPassword = user[i].getPassword();
                if (newId.equals(id)) {
                    if (newPassword.equals(password)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean overlapIdCheck(String id) {
        for (int i = 0; i < user.length; i++) {
            if (user[i] != null) {
                String newId = user[i].getId();
                if (newId.equals(id)) {
                    return false;
                }
            }
        }
        return true;
    }

    private int userNum(String id) {
        for (int i = 0; i < user.length; i++) {
            if (user[i] != null) {
                String newId = user[i].getId();
                if (newId.equals(id)) {
                    return i;
                }
            }
        }
        return 0;
    }

}
