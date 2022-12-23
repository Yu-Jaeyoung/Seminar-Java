package java_2022.ch7;

public class CarExample {
    public static void main(String[] args) {
        Car2 car = new Car2();
        for (int i = 0; i <= 5; i++) {
            int problemLocation = car.run();
            if (problemLocation != 0) {
                System.out.println(car.tires[problemLocation - 1].location + " Change to HankookTire");
                car.tires[problemLocation - 1] = new HankookTire(car.tires[problemLocation - 1].location, 15);
            }
            System.out.println("---------------------------");
        }
    }
}
