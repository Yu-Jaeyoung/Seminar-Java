package java_2022.ch7;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("Size of Circle : " + calculator.areaCircle(r));
        System.out.println();

        Computer computer = new Computer();
        System.out.println("Size of Circle : " + computer.areaCircle(r));
    }
}
