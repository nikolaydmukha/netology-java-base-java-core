package home.netology.javacore.patterns.creational.builder;

public class PersonBuilder {
    private Person newPerson;

    public PersonBuilder() {
        this.newPerson = new Person();
    }

    PersonBuilder withName(String name) {
        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Нельзя создать человека без имени");
        }
        newPerson.setName(name);
        return this;
    }

    PersonBuilder withLastName(String lastName) {
        if (lastName == null || lastName.equals("")) {
            throw new IllegalArgumentException("Нельзя создать человека без фамилии");
        }
        newPerson.setLastName(lastName);
        return this;
    }

    PersonBuilder withAge(byte age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        newPerson.setAge((byte)age);
        return this;
    }

    PersonBuilder withCity(String city) {
        newPerson.setCity(city);
        return this;
    }

    Person build() {
        if(newPerson.getName() == null || newPerson.getLastName() == null){
            throw new IllegalArgumentException("Вы не указали обязательные поля!");
        }
        return newPerson;
    }

}
