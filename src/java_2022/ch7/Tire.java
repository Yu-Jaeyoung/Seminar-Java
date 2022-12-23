package java_2022.ch7;

public class Tire {
    //필드
    public int maxRotation; //최대 회전수
    public int accumulatedRotation; //누적 회전수
    public String location; //타이어의 위치

    //생성자
    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    //메소드
    public boolean roll() {
        ++accumulatedRotation; //누적 회전수 1 증가
        if (accumulatedRotation < maxRotation) {
            System.out.println( location + " tire time left : " + (maxRotation - accumulatedRotation));
            return true;
        } else {
            System.out.println("***" + location + "Tire funked ***");
            return false;
        }
    }
}
