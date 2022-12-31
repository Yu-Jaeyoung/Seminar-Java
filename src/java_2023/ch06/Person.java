package java_2023.ch06;

public class Person {
    final String nation = "Korea";
    final String ssn;
    String name;

    public Person(String ssn, String name) {
        this.ssn = ssn; // 해당 부분 미작성 시 컴파일 오류 발생
        this.name = name;
    }
}
