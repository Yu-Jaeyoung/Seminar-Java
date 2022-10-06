package ch12;

public class ThreadA1 extends Thread{
    public boolean stop = false;
    public boolean work = true;

    public void run() {
        while(stop){
            if(work) {
                System.out.println("ThreadA1 작업 내용");
            } else {
                Thread.yield();
            }
        }
        System.out.println("ThreadA 종료");
    }
}
