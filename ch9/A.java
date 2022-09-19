package ch9;

//바깥 클래스
public class A {

    A() {
        System.out.println("new A");
    }

    class B {
        B() {
            System.out.println("new B");
        }

        int field1;

        //static int field2;
        void method1() {
        }
        //static void method2() { }
    }

    //정적멤버 클래스
    static class C {
        C() {
            System.out.println("new C");
        }

        int field1;
        static int field2;

        void method1() {
        }
        static void method2(){
            
        }
    }

    void method() {
        //로컬 클래스
        class D {
            D() {
                System.out.println("new D");
            }

            int field1;

            //static int field2;
            void method1() {
            }
            //static void method2(){ }
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
