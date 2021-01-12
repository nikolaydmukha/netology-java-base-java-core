package main.java.home.netology.javabase.abstract_interface.flyingobjects;

public abstract class FlyingObjects {

    String model;

    public abstract void fly();
    public void showInfo (){
        System.out.println("Тематика 'Летающие объекты'");
    }
    public abstract void addFuel();

}
