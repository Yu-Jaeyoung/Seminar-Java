package java_2022.ch7;

class A1 {}
class B1 extends A1 {}
class C extends B1 {}
class D1 extends B1 {}
class E extends C {}

public class PromotionExample {
    public static void main(String[] args) {
        B1 b = new B1();
        C c = new C();
        D1 d = new D1();
        E e = new E();

        A1 a1 = b;
        A1 a2 = c;
        A1 a3 = d;
        A1 a4 = e;

        B1 b1 = d;
        C c1 = e;

        //B b3 = e;
        //C c2 = d;
    }
}
