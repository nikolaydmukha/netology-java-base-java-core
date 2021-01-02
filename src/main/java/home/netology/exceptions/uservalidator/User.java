package main.java.home.netology.exceptions.uservalidator;

public class User {
    private String login;
    private String password;
    private String email;
    private byte age;

    public User(String login, String password, String email, byte age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public byte getAge() {
        return age;
    }
}
