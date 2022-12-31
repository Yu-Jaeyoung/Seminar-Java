package java_2023.ch06;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc = new Calculator();
        myCalc.powerOn();

        int result1 = myCalc.plus(5, 6);
        System.out.println("result1 : " + result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCalc.divide(x, y);
        System.out.println("result2 : " + result2);

        myCalc.powerOff();

        myCalc.execute();

        Calculator myCalcu = new Calculator();

        double result3 = myCalcu.areaRectangle(10);
        double result4 = myCalcu.areaRectangle(10, 20);

        System.out.println("정사각형 넓이 = " + result3);
        System.out.println("직사각형 넓이 = " + result4);
        System.out.println();

        double result5 = 10 * 10 * Calculator.pi;
        int result6 = Calculator.plus2(10, 5);
        int result7 = Calculator.minus2(10, 5);

        System.out.println("result 5 : " + result5);
        System.out.println("result 6 : " + result6);
        System.out.println("result 7 : " + result7);
    }
}
