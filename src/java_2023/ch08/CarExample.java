package java_2023.ch08;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        System.out.println("After Change Tire"); // 필드 다형성

        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();

        myCar.run();
    }
}
