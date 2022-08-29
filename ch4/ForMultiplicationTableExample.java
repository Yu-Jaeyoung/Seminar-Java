package ch4;

public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for(int m=2; m<=9; m++)
        {
            System.out.println("*** " + m + " X " + m + " ***");
            for(int i = 1; i<=9; i++)
            {
                System.out.println(i + "x" + i +"=" + (m*i));
            }
        }
    }
}
