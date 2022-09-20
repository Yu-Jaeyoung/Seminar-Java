package ch7;

public class SmartPhone extends Phone{
    //생성자
    public SmartPhone(String owner){
        super(owner);
    }
    //메소드
    public void internetSearch(){
        System.out.println("Searching...");
    }
}
