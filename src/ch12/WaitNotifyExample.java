package ch12;

public class WaitNotifyExample {
    public static void main(String[] args) {
        WorkObject sharedObject = new WorkObject(); // 공유 객체 생성
        ThreadA2 threadA2 = new ThreadA2(sharedObject);
        ThreadB2 threadB2 = new ThreadB2(sharedObject);

        threadA2.start();
        threadB2.start();
    }
}
