package home.netology.javacore.junit.jsonparser;

public class Employee {
    private int id;
    private String firstname;
    private String lastname;
    private String country;
    private byte age;

    public Employee(int id, String firstname, String lastname, String country, byte age) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.country = country;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{firstName = " + this.firstname + ", lastName = " + this.lastname + ", country = " + this.country + ", age = " + this.age + "}";
    }

}
