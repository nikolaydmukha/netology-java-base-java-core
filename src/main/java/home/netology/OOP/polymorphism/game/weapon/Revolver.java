package main.java.home.netology.OOP.polymorphism.game.weapon;

public class Revolver extends Weapon {

    public Revolver(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println("Revolver shoot");
    }
}
