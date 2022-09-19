package ch9;

public class Anonymous {
    //필드 초기값으로 대입
    Person field = new Person() {
        void work() {
            System.out.println("Go to work");
        }

        @Override
        void wake() {
            System.out.println("Get up at 6 o'clock");
            work();
        }
    };

    void method1() {
        //로컬 변수값으로 대입
        Person localVar = new Person() {
            void walk() {
                System.out.println("Walking");
            }

            @Override
            void wake() {
                System.out.println("Get up at 7 o'clock");
                walk();
            }
        };

        //로컬 변수 사용
        localVar.wake();
    }

    void method2(Person person) {
        person.wake();
    }
}
