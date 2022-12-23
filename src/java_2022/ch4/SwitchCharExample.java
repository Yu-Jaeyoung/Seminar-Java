package java_2022.ch4;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch(grade){
            case 'A':
            case 'a':
                System.out.println("VVIP");
                break;
            case'B':
            case'b':
                System.out.println("VIP");
                break;
            default:
                System.out.println("Guest");
        }
    }
}
