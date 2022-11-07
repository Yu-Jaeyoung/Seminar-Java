package ch14;

//매개 변수와 리턴값이 없는 람다식
/*@FunctionalInterface
public interface MyFunctionalInterface {
    public void method();
}*/

//매개 변수가 있는 람다식
/*
@FunctionalInterface
public interface MyFunctionalInterface {
    public void method(int x);
}*/

//리턴값이 있는 람다식
/*
@FunctionalInterface
public interface MyFunctionalInterface {
    public int method(int x, int y);
}*/

public interface MyFunctionalInterface {
    public void method();
}