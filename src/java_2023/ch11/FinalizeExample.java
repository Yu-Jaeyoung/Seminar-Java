package java_2023.ch11;

public class FinalizeExample {
    public static void main(String[] args) {
        Counter counter;
            counter = new Counter(1);
            counter = null;
            counter = new Counter(2);
            counter = new Counter(3);
            System.gc();

    }
}

class Counter {
    public int no;

    public Counter(int no) {
        this.no = no;
        System.out.println("Counter(" + no + ") 가 메모리에 생성됨");

    }

    public void finalize() {
        System.out.println(no + "에 있는 finalize() 실행");
    }
}