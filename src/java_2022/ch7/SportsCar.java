package java_2022.ch7;

public class SportsCar extends Car {
    @Override
    public void speedUp() {
        speed += 10;
    }

    /*
    @Override
    public void stop() {
        System.out.println("Sports car stopped");
        speed = 0;
    }
    */
}
