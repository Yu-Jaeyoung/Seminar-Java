package java_2022.ch8;

public class RemoteControllerExample {
    public static void main(String[] args) {

        RemoteControl rc = null;

        rc = new Television();
        rc.turnOn();
        rc.setMute(true);

        rc = new Audio();
        rc.turnOn();
        rc.setMute(true);

    }
}
