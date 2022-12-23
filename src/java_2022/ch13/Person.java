package java_2022.ch13;

public class Person {
    String name;
    public Person(String name) {
        this.name = name;
    };
    public String getName() {return name;}

    @Override
    public String toString() {
        return name;
    }
}