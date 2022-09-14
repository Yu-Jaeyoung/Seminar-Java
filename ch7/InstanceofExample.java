package ch7;

public class InstanceofExample {
    public static void method1(Parent parent){
        if(parent instanceof Child){
            Child child = (Child) parent;
            System.out.println("method1 - changed to Child");
        }else{
            System.out.println("method1 - unchanged to Child");
        }
    }
    
    public static void method2(Parent parent){
<<<<<<< HEAD
        //Child child = (Child) parent; //ClassCastException 발생 가능성 있음
=======
        Child child = (Child) parent; //method2(parentB) 에서 ClassCastException 발생
>>>>>>> 11e6a59 (update)
        System.out.println("method2 - changed to Child");
    }
    
    public static void main(String[] args){
        Parent parentA = new Child();
        method1(parentA);
        method2(parentA);
        
        Parent parentB = new Parent();
        method1(parentB);
        method2(parentB); //예외 발생
    }
}
