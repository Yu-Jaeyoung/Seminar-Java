package java_2022.ch8;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.run();

        System.out.println("------Change TIre------");

        myCar.tires[0] = new KumhoTire();
        myCar.tires[1] = new KumhoTire();

        myCar.run();
    }
}
