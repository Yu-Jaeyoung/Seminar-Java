package ch7;

public class SupersonicAirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
<<<<<<< HEAD
        System.out.println(sa.flyMode);
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        System.out.println(sa.flyMode);
=======
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
>>>>>>> 11e6a59 (update)
        sa.fly();
        sa.land();
    }
}
