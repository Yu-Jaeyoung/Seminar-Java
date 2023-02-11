package java_2023.ch11;

public class Countercheck {
    private int no;

    public Countercheck(int no) {
        this.no = no;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "에 있는 finalize() 실행");
    }
}
