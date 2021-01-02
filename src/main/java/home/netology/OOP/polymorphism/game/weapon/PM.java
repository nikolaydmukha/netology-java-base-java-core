package main.java.home.netology.OOP.polymorphism.game.weapon;

public class PM extends Weapon {

    public PM(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println("PM shoot");
    }
}
