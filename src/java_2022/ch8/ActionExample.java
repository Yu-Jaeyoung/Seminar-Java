package java_2022.ch8;

public class ActionExample {
    public static void main(String[] args) {
        Action action = new Action() {
            @Override
            public void work() {
                System.out.println("copy");
            }
        };
        action.work();
    }
}
