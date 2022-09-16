package ch8;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        System.out.println("------Change TIre------");

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar.run();
    }
}
