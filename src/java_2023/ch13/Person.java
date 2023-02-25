package java_2023.ch13;

public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {return name;}


    //아래 선언이 들어가야지 요구되는 형태출력 ~ 기존에는 class명과 hex로 변환된 주소값?으로 출력
    @Override
    public String toString() {
        return name;
    }
}
