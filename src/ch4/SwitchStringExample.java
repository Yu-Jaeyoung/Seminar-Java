package ch4;

public class SwitchStringExample {
    public static void main(String[] args) {
        String postion = "Head Coach";

        switch(postion) {
            case "Head Coach":
                System.out.println("700$");
                break;
            case "Coach":
                System.out.println("500$");
                break;
            default:
                System.out.println("300$");
        }
    }
}
