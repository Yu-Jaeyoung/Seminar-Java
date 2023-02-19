package java_2023.ch12;

public class TargetThread extends Thread {
    public void run() {
        for (long i = 0; i < 2000000000; i++) {
        }

        try {
            Thread.sleep(1500);  //1.5초간 일시 정지
        } catch (Exception e) {
        }

        for (long i = 0; i < 2000000000; i++) {
        }
    }
}