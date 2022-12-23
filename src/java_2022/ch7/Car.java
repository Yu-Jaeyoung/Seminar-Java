package java_2022.ch7;

public class Car {
    //필드
    public int speed;

    //메소드
    public void speedUp() {
        speed += 1;
    }

    //final 메소드
    public final void stop() {
        System.out.println("Car stopped");
        speed = 0;
    }
}
