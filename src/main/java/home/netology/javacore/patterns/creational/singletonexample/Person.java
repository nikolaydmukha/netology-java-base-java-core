package home.netology.javacore.patterns.creational.singletonexample;

public class Person {

    private static Person instance;
    private String name;
    private String lastName;
    private int wallet = 1000;

    private Person(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public static Person getInstance(){
        if(instance == null){
            instance = new Person("Николай", "Дмуха");
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWallet() {
        return wallet;
    }

    public void changeWallet(){
        wallet += 100;
    }
}
