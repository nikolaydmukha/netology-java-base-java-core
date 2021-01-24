package home.netology.javacore.patterns.creational.builder;

import java.util.Formatter;

public class Person {
    private String name;
    private String lastName;
    private String city;
    private byte age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean hasAge() {
        return this.age > 0 ? true : false;
    }

    public boolean hasAddress() {
        return this.city == null ? false : true;
    }

    public void happyBirthday() {
        System.out.println("Happy birthday!");
        this.age += 1;
    }

    @Override
    public String toString() {
        String cityInfo;
        Formatter f = new Formatter();
        if (hasAddress()) {
            cityInfo = this.city;
        } else {
            cityInfo = "город не указан";
        }
            String personInfo = f.format("Имя: %s Фамилия: %s Возраст: %d Город: %s",
                    this.name, this.lastName, this.age, cityInfo).toString();
        return personInfo;
    }

    @Override
    public int hashCode() {

        return this.name.hashCode() + this.lastName.hashCode() + this.age + this.city.hashCode();
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.withLastName(this.lastName)
                .withAge((byte)10)
                .withCity(this.city);

        return child;
    }
}
