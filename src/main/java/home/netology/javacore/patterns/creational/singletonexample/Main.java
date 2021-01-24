package home.netology.javacore.patterns.creational.singletonexample;

public class Main {
    public static void main(String[] args) {
        Person person = Person.getInstance();

        System.out.println(person.getName() + " " + person.getLastName());
        person.changeWallet();

        Person anotherPerson = Person.getInstance();
        System.out.println(anotherPerson.getName() + " " + anotherPerson.getLastName());
        System.out.println(anotherPerson.getWallet());
    }
}
