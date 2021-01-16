package home.netology.javabase.OOP.polymorphism.game.weapon;

public class Weapon {
    protected String name;

    public Weapon(String name) {
        this.name = name;
    }

    public void shoot() {
        System.out.println("Weapon shoot");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Weapon) {
            if (name.equals(((Weapon) obj).name)) {
                return true;
            }
        }
        return false;
    }
}
