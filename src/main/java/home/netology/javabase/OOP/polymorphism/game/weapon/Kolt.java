package home.netology.javabase.OOP.polymorphism.game.weapon;

public class Kolt extends Weapon {

    public Kolt(String name) {
        super(name);
    }

    @Override
    public void shoot() {
        System.out.println("Kolt shoot");
    }
}
