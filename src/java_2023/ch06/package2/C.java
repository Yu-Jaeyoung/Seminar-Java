package java_2023.ch06.package2;

import java_2023.ch06.package1.*;

public class C {
    public C(){
        A a = new A();
        a.field1 = 1;
        // a.field2 = 1; // default 필드 접근 불가(컴파일 에러)
        // a.field3 = 1; // private 필드 접근 불가(컴파일 에러)

        a.method1();
        // a.method2(); // default 메소드 접근 불가(컴파일 에러)
        // a.method3(); // private 메소드 접근 불가(컴파일 에러)

    }
}
