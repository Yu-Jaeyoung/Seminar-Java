package java_2023.ch16;

public class Student {
    private String name = "";
    private int score = 0;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}