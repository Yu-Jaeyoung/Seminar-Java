package java_2022.ch4;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score = 75;
        if(score>=90) {
            System.out.println("Score is 100~90");
            System.out.println("Grade is A");
        }
        else if(score >= 80) {
            System.out.println("Score is 80~89");
            System.out.println("Grade is B");
        }
        else if(score >= 70){
            System.out.println("Score is 70~79");
            System.out.println("Grade is C");
        }
        else{
            System.out.println("Score is less than 70");
            System.out.println("Grade is D");
        }
    }
}
