package java_2022.ch4;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        int time = (int)(Math.random()*4)+8;
        System.out.println("NOW : " + time + "o'clock");

        switch(time){
            case 8:
                System.out.println("go to work.");
            case 9 :
                System.out.println("have seminar");
            case 10:
                System.out.println("do work");
            case 11:
                System.out.println("go out");
        }
    }
}
