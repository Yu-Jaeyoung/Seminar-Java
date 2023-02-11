package java_2023.ch11;

public class Counter {
    private int no;

    public Counter(int no) {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "에 있는 finalize() 실행");
    }
}
