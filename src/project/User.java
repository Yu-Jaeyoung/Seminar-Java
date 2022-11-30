package project;

public class User {

    private String id;
    private String password;
    private String nickName;

    public User(String id, String password, String nickName) {
        this.id = id;
        this.password = password;
        this.nickName = nickName;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getNickName() {
        return nickName;
    }
}
