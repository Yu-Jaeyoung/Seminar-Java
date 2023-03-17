package java_2023.ch16;

public class Student implements Comparable<Student>{
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

    @Override
    public int compareTo(Student o){
        return Integer.compare(score, o.score);
    }
}