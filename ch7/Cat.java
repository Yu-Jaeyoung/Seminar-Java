package ch7;

public class Cat extends Animal {
    public Cat(){
        this.kind = "mammalia";
    }

    @Override
    public void sound(){
        System.out.println("meow");
    }
}
