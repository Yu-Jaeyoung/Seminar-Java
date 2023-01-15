package java_2023.ch08;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        System.out.println("After Change Tire"); // 필드 다형성

        myCar.frontLeftTire = new KumhoTire();
        myCar.frontRightTire = new KumhoTire();

        myCar. run();
    }
}
