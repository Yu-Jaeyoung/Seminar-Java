package java_2022.ch12;

public class ThreadB1 extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run() {
        while (stop) {
            if (work) {
                System.out.println("ThreadB1 작업 내용");
            } else {
                Thread.yield();
            }
        }
        System.out.println("ThreadB 종료");
    }
}
