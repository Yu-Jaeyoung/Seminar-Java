package java_2022.ch4;

import java.util.Scanner; //Scanner 클래스 사용하기 위해 필요

public class DoWhileExample {
    public static void main(String[] args) {
        System.out.println("Input message");
        System.out.println("Input 'q' to Quit");

        Scanner scanner = new Scanner(System.in); //Scanner 객체 생성
        String inputString;

        do{
            System.out.println(">");
            inputString = scanner.nextLine(); //키보드로 입력한 문자열을 얻음
            System.out.println(inputString);
        } while( ! inputString.equals("q")); //문자열 비교할때는 equals() 메소드 사용

        System.out.println();
        System.out.println("Fin");

    }
}
