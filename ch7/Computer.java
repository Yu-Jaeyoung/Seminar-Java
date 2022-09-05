package ch7;

public class Computer extends Calculator {
    @Override
    double areaCircle(double r) {
        System.out.println("Run areaCircle() of class Computer");
        return Math.PI * r * r;
    }
}
