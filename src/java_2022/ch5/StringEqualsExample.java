package java_2022.ch5;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "Tom";
        String strVar2 = "Tom";

        if(strVar1 == strVar2){
            System.out.println("strVar1 & strVar2 reference are same");
        } else{
            System.out.println("strVar1 & strVar2 reference aren't same");
        }

        if(strVar1.equals(strVar2)){
            System.out.println("strVar1 & strVar2 string are same");
        }

        String strVar3 = new String("Tom");
        String strVar4 = new String("Tom");

        if(strVar3 == strVar4){
            System.out.println("strVar3 & strVar4 reference are same");
        } else {
            System.out.println("strVar3 & strVar4 reference aren't same");
        }

        if(strVar3.equals(strVar4)){
            System.out.println("strVar3 & strVar4 string are same");
        }
    }
}
