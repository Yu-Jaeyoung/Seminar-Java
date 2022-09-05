package ch7;

public class CellPhone {

    //필드
    String model;
    String color;

    //생성자

    //메소드
    void powerOn() {
        System.out.println("Turn On");
    }

    void powerOff() {
        System.out.println("Turn Off");
    }

    void bell() {
        System.out.println("Bell is ringing");
    }

    void sendVoice(String message) {
        System.out.println("Me : " + message);
    }

    void receiveVoice(String message) {
        System.out.println("Opponent : " + message);
    }

    void hangUp() {
        System.out.println("Hang Up");
    }
}
