package ch4;

public class IfExample {
    public static void main(String[] args) {
        int score = 90;

        //System.out.println("한글");

        if (score >= 90) {
            System.out.println("Score is huge");
            System.out.println("grade is A");

        }

        if (score < 90) {
            System.out.println("score is less than 90");
            System.out.println("grade is B");

        }
    }

}