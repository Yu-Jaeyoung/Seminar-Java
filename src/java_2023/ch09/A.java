package java_2023.ch09;

/* 바깥 클래스 */
class A {
    A() {
        System.out.println("A 객체가 생성됨");
    }

    /* 인스턴스 멤버 클래스 */
    class B {
        B() {                            // 생성자
            System.out.println("B 객체가 생성됨");
        }

        int field1;                      // 인스턴스 필드

        // static int field2;            // 정적 필드 (x)
        void method1() {
        }               // 인스턴스 메소드
        // static void method2() { }     // 정적 메소드 (x)
    }

    /* 정적 멤버 클래스 */
    static class C {
        C() {                             // 생성자
            System.out.println("C 객체가 생성됨");
        }

        int field1;                       // 인스턴스 필드
        static int field2;                // 정적 필드 (x)

        void method1() {
        }                                 // 인스턴스 메소드

        static void method2() {
        }                                 // 정적 메소드 (x)
    }

    void method() {
        /* 로컬 클래스 */
        class D {
            D() {                         // 생성자
                System.out.println("D 객체가 생성됨");
            }

            int field1;                   // 인스턴스 필드

            // static int field2;         // 정적 필드 (x)
            void method1() {              // 인스턴스 메소드
            }
            // static void method2() { }  // 정적 메소드 (x)
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
