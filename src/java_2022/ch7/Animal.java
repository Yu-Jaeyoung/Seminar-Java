package java_2022.ch7;

public abstract class Animal {
    public String kind;

    public void breathe(){
        System.out.println("Breathing");
    }

    public abstract void sound();
}
