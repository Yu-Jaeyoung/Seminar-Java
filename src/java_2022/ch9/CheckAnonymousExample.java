package java_2022.ch9;

public class CheckAnonymousExample {
    public static void main(String[] args) {
        CheckAnonymous anony = new CheckAnonymous();
        anony.field.run();
        anony.method1();
        anony.method2(
                new Vehicle() {
                    @Override
                    public void run() {
                        System.out.println("Truck is moving.");
                    }
                }
        );
    }
}
