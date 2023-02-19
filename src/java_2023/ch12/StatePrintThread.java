package java_2023.ch12;

public class StatePrintThread extends Thread {
    private Thread targetThread;

    public StatePrintThread(Thread targetThread) {
        this.targetThread = targetThread;
    }

    public void run() {
        while (true) {
            Thread.State state = targetThread.getState(); // 스레드 상태 얻기
            System.out.println("타겟 스레드 상태 : " + state);

            if (state == Thread.State.NEW) { // 생성 상태일 경우 대기 상태로 만듬
                targetThread.start();
            }

            if (state == Thread.State.TERMINATED) { // 종료 상태일 경우 while문 종료
                break;
            }
            try {
                Thread.sleep(500);  // 0.5초간 일시정지
            } catch (Exception e) {
            }
        }
    }
}