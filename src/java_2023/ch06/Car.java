package java_2023.ch06;

public class Car {
    // 필드
    String company = "현대 자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed;
    int gas;

    // 생성자
    Car() {

    }

    Car(String model) {
        this(model, "은색", 250);
    }

    Car(String model, String color) {
        this(model, color, 250);
    }

    Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car(String color, int cc) {
    }

    // 메소드
    void setGas(int gas) {
        this.gas = gas;
    }

    boolean isLeftGas() {
        if (this.gas == 0) {
            System.out.println("gas가 없습니다.");
            return false;
        }
        System.out.println("gas가 있습니다.");
        return true;
    }

    void run() {
        while (true) {
            if (this.gas > 0) {
                System.out.println("달립니다.(gas 잔량 : " + this.gas + ")");
                this.gas -= 1;
            } else {
                System.out.println("멈춥니다.(gas 잔량 : " + this.gas + ")");
                return; // 메소드 실행 종료
            }
        }
    }

    int getSpeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    void run2() {
        for (int i = 10; i <= 50; i += 10) {
            speed = i;
            System.out.println("달립니다. (시속 : " + speed + "km/h)");
        }
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run3() {
        for (int i = 10; i <= 50; i += 10) {
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h)");
        }
    }
}
