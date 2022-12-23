package java_2022.ch7;

public class Car2 {
    //필드
    //자동차는 4개의 타이어를 가진다.
    Tire[] tires = {
            new Tire("front left", 6),
            new Tire("front right", 2),
            new Tire("back left", 3),
            new Tire("back right", 4)
    };


    //생성자
    //메소드
    //모든 타잉를 1회 회전시키기 위해 각 Tire 객체의 roll() 메소드를 호출한다.
    //false를 리턴하는 roll()이 있을경우 stop()메소드를 호출하고 해당 타이어 번호를 리턴한다.
    int run() {
        System.out.println("[Car is moving]");
        for (int i = 0; i < tires.length; i++) {
            if (tires[i].roll() == false) {
                stop();
                return (i + 1);
            }
        }
        return 0;
    }

    //펑크났을때 사용
    void stop() {
        System.out.println("[Car stopped]");
    }
}
