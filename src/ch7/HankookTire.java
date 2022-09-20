package ch7;

public class HankookTire extends Tire {
    //필드
    //생성자
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    //메소드
    @Override
    public boolean roll() {
        ++accumulatedRotation; //누적 회전수 1 증가
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + " HankookTire time left : " + (maxRotation - accumulatedRotation));
            return true;
        } else {
            System.out.println("***" + location + "HankookTire funked ***");
            return false;
        }
    }
}
