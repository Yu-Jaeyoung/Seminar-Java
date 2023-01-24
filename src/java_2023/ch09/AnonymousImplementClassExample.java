package java_2023.ch09;

public class AnonymousImplementClassExample {
    public static void main(String[] args) {
        AnonymousImplementClass anonymous = new AnonymousImplementClass();
        // 익명 객체 필드 사용
        anonymous.field.turnOn();
        // 익명 객체 로컬 변수 사용
        anonymous.method1();
        // 익명 객체 매개값 사용
        anonymous.method2(
                new RemoteControl() {
                    @Override
                    public void turnOn() {
                        System.out.println("SmartTV를 켭니다.");
                    }

                    @Override
                    public void turnOff() {
                        System.out.println("SmartTV를 끕니다.");
                    }
                }
        );
    }
}
