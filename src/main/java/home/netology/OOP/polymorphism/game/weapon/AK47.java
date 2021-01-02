package main.java.home.netology.OOP.polymorphism.game.weapon;

public class AK47 extends Weapon {

    public AK47(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println("AK47 shoot");
    }
}
