package ch4;

public class ForSumFrom1To100Example {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=1; i<=100; i++){
            sum += i;
        }

        System.out.println("sum of 1 to 100  : " + sum);
    }
}
