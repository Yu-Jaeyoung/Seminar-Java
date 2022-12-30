package java_2022.project2.user.repository;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserRepository {
    private final Set<UserEntity> userDB;
    // Set 컬렉션으로 User DB 생성

    public UserRepository() {
        userDB = new HashSet<>();
    }
    // Set 인터페이스의 구현 클래스인 HashSet 사용

    public List<UserEntity> getUserDB() {
        return userDB.stream().toList();
    }
    // DB를 stream을 활용하여 List형태로 반환

    public void add(UserEntity userEntity) {
        userDB.add(userEntity);
    }
    // userDB에 UserEntity 값을 추가하는 add 메소드
}
