package java_2022.project2.user.repository;

public class UserEntity {
    private final String id;
    private final String password;

    public UserEntity(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
}
