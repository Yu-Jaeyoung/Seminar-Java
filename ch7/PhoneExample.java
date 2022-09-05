package ch7;

public class PhoneExample {
    public static void main(String[] args) {
        //Phone phone = new Phone();

        SmartPhone smartPhone = new SmartPhone("Kim");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
