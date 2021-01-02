package main.java.home.netology.collections.listcollection.email;

public class Mail {
    private String email;
    private String message;

    public Mail(String email, String message) {
        this.email = email;
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("mail to: %s\n%s", email, message);
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }
}
