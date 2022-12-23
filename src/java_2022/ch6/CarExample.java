package java_2022.ch6;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        //잘못된 속도 변경
        myCar.setSpeed(-50);

        System.out.println("Now Speed : " + myCar.getSpeed());

        //올바른 속도 변경
        myCar.setSpeed(60);

        //멈춤
        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("Now Speed : " + myCar.getSpeed());
    }
}
