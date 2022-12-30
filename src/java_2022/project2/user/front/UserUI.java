package java_2022.project2.user.front;

public class UserUI {
    public void welcomeUI() {
        System.out.println("주문 시스탬 구현");
    }

    public void signUpOrSignInUI() {
        System.out.println(" 1. 회원 가입 | 2. 로그인 ");
        System.out.print(" -> ");
    }

    public void signUpUI() {
        System.out.println(" == 회원 가입 페이지 == ");
    }

    public void signUpSuccess() {
        System.out.println("회원 가입 성공");
    }

    public void signUpFail() {
        System.out.println("회원 가입 실패");
    }

    public void signInUI() {
        System.out.println(" == 로그인 페이지 == ");
    }

    public void signInSuccess() {
        System.out.println("로그인 성공");
    }

    public void signInFail() {
        System.out.println("로그인 실패");
    }

    public void sameId(){
        System.out.println(" 동일한 아이디가 있습니다. ");
    }

    public void inputId() {
        System.out.print(" 아이디 입력 : ");
    }

    public void inputPasswd() {
        System.out.print(" 비밀번호 입력 : ");
    }

    public void invalidInput() {
        System.out.println(" 잘못 입력하셨습니다. ");
    }
}
