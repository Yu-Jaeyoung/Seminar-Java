package java_2022.ch4;

public class WhileKeyControlExample {
    public static void main(String[] args) throws Exception {

        boolean run = true;
        int speed = 0;
        int keyCode = 0;

        while (run) {
            if (keyCode != 13 && keyCode != 10) {
                System.out.println("-------------------------------------");
                System.out.println("1. Speed up | 2. Speed down | 3. Stop");
                System.out.println("-------------------------------------");
                System.out.println("Choose : ");
            }

            keyCode = System.in.read();

            if (keyCode == 49) {
                speed++;
                System.out.println("Speed = " + speed);
            } else if (keyCode == 50) {
                speed--;
                System.out.println("Speed = " + speed);
            } else if (keyCode == 51) {
                run = false;

            }

        }
        System.out.println("Stop");
    }
}
