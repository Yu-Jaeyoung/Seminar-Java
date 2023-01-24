package java_2023.ch09;

public class Outer {
    String field = "Outer-field";

    void method() {
        System.out.println("Outer-method");
    }

    class Nested {
        String field = "Nested-field";

        void method() {
            System.out.println("Nested-method");
        }

        void print() {
            System.out.println(this.field);
            this.method();
            System.out.println(Outer.this.field);
            Outer.this.method();
        }
    }
}