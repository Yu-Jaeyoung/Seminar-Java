package ch6;

public class Singleton {
    public static Singleton singleton = new Singleton();

    private Singleton() {}

    static Singleton getInstance(){
        return singleton;

    }
}
