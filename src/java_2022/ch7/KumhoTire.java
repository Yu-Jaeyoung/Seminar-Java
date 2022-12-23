package java_2022.ch7;

public class KumhoTire extends Tire {
    //필드
    //생성자
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    //메소드
    @Override
    public boolean roll() {
        ++accumulatedRotation; //누적 회전수 1 증가
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " KumhoTire time left : " + (maxRotation - accumulatedRotation));
            return true;
        } else {
            System.out.println("***" + location + "KumhoTire funked ***");
            return false;
        }
    }
}
