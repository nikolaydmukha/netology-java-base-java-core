package main.java.home.netology.OOP.polymorphism.game.weapon;

public class SVD extends Weapon {

    public SVD(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println("SVD shoot");
    }
}
