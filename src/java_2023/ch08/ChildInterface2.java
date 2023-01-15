package java_2023.ch08;

public interface ChildInterface2 extends ParentInterface {
    @Override
    public default void method2() { //재정의

    }

    public void method3();
}
