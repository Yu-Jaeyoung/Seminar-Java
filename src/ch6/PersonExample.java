package ch6;

public class PersonExample {
    public static void main(String[] args) {
        Person p1 = new Person("123456-1234567", "Kim");

        System.out.println(p1.nation);
        System.out.println(p1.ssn);
        System.out.println(p1.name);

        // p1.nation = "usa"; final 필드는 값 수정 불가
        // p1.ssn = "123123-1234123"; final 필드는 값 수정 불가
        p1.name = "Park";
    }
}
