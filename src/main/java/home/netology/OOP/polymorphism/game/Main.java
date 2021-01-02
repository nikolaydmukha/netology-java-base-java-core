package main.java.home.netology.OOP.polymorphism.game;

import main.java.home.netology.OOP.polymorphism.game.weapon.AK47;
import main.java.home.netology.OOP.polymorphism.game.weapon.Kolt;
import main.java.home.netology.OOP.polymorphism.game.weapon.Revolver;
import main.java.home.netology.OOP.polymorphism.game.weapon.SVD;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player();

        player1.addWeapon(new Revolver("Revolver"));
        player1.addWeapon(new SVD("SVD"));

        player1.addWeapon(new Kolt("Kolt"));
        player1.addWeapon(new AK47("AK47"));

        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        try {
            while (!isValid) {
                System.out.println("Enter the weapon`s slot number for shooting or other digit for exit");
                if (scanner.hasNext()) {
                    if (scanner.hasNextInt()) {
                        int slot = scanner.nextInt();
                        player1.getWeaponBySlotNumber(slot).shoot();
                    }
                }
                isValid = true;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
