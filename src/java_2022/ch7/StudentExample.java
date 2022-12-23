package java_2022.ch7;

public class StudentExample {
    public static void main(String[] args){
        Student student= new Student("Kim","123456-123467",1);
        System.out.println("name : " + student.name);
        System.out.println("ssn : " + student.ssn);
        System.out.println("studentNo : " + student.studentNo);
    }
}
