package home.netology.javabase.collections.listcollection.email;

public class UserProfile {
    private String name;
    private String lastName;
    private String email;

    public UserProfile(String name, String lastName, String email) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
