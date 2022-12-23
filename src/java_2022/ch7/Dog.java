package java_2022.ch7;

public class Dog extends Animal{
    public Dog(){
        this.kind = "mammalia";
    }

    @Override
    public void sound(){
        System.out.println("woof woof");
    }
}
