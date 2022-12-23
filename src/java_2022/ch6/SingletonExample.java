package java_2022.ch6;

public class SingletonExample {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if(obj1 == obj2){
            System.out.println("Same instance");

        } else {
            System.out.println("Diff instance");
        }
    }
}
