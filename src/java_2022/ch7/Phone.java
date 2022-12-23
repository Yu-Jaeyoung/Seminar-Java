package java_2022.ch7;

public abstract class Phone {
    //필드
    public String owner;

    //생성자
    public Phone(String owner){
        this.owner = owner;
    }

    //메소드
    public void turnOn(){
        System.out.println("Turn On");
    }
    public void turnOff(){
        System.out.println("Turn Off");
    }
}
