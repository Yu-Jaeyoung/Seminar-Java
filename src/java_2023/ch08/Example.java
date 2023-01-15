package java_2023.ch08;

public class Example {
    public static void main(String[] args) {
        ImplementationC imp1 = new ImplementationC();

        InterfaceA ia = imp1;
        ia.methodA();
        System.out.println(); // interfaceA 변수는 methodA()만 호출 가능

        InterfaceB ib = imp1;
        ib.methodB();
        System.out.println(); // interfaceB 변수는 methodB()만 호출 가능

        InterfaceC ic = imp1; // interfaceC 변수는 methodA(), methodB(), methodC() 모두 호출 가능
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
