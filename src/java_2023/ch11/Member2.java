package java_2023.ch11;

public class Member2 implements Comparable<Member2> {
    String name;

    Member2(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Member2 o) {
        return name.compareTo(o.name);
    }
}
