package ch12;

public class YieldExample {
    public static void main(String[] args) {
        ThreadA1 threadA1 = new ThreadA1();
        ThreadB1 threadB1 = new ThreadB1();

        threadA1.start();
        threadB1.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        threadA1.work = false;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        threadA1.work = true;

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        threadA1.stop = true;
        threadB1.stop = true;
    }
}
