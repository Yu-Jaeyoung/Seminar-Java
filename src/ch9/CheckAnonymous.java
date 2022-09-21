package ch9;

public class CheckAnonymous {
    Vehicle field = new Vehicle() {
        @Override
        public void run() {
            System.out.println("Bike is moving.");
        }
    };

    void method1() {
        Vehicle localVar = new Vehicle() {
            @Override
            public void run() {
                System.out.println("Car is moving");
            }
        };
        localVar.run();
    }

    void method2(Vehicle v) {
        v.run();
    }
}
