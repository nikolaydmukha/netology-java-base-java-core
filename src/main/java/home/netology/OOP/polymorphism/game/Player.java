package main.java.home.netology.OOP.polymorphism.game;

import main.java.home.netology.OOP.polymorphism.game.weapon.Weapon;

public class Player {
    private Weapon[] weapons;
    private int weaponsAmount = 0;

    public Player() {
        this.weapons = new Weapon[5];
    }

    public void addWeapon(Weapon weapon) {
        if (weaponsAmount == 5) {
            throw new IndexOutOfBoundsException("There are no free weapon`s slots");
        }
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] == null) {
                weapons[i] = weapon;
                weaponsAmount++;
                break;
            }
        }
    }

    public void removeWeapon(Weapon weapon) {
        if (weaponsAmount == 0) {
            throw new IndexOutOfBoundsException("There are no weapons");
        }
        for (int i = 0; i < weapons.length; i++) {
            if (weapons[i] != null) {
                if (weapons[i].equals(weapon)) {
                    weapons[i] = weapon;
                    weaponsAmount--;
                    break;
                }
            }
        }
    }

    public int weaponsAmount() {
        return weapons.length;
    }

    public Weapon getWeaponBySlotNumber(int i) throws Exception {
        if (i > 0 && i < 5) {
            return weapons[i + 1];
        } else {
            throw new Exception("Incorrect slot number! Should be value from 1 to 5");
        }
    }
}
