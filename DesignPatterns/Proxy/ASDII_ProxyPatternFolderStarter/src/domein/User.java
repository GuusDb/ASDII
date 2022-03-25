package domein;

public class User {

    private final String userName;
    private final String password;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public boolean passwdValid(String passwd) {
        return password.equals(passwd);
    }
}
