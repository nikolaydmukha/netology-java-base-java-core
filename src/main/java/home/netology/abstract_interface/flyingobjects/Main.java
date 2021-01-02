package main.java.home.netology.abstract_interface.flyingobjects;

import main.java.home.netology.abstract_interface.flyingobjects.aircraft.Boeing777;
import main.java.home.netology.abstract_interface.flyingobjects.helicopter.Mi8;
import main.java.home.netology.abstract_interface.flyingobjects.rocket.RocketSalut;

public class Main {
    public static void main(String[] args) {
        //Create aircrafts
        Boeing777 boeing777 = new Boeing777("Boeing777");
        Mi8 mi8 = new Mi8("Mi8");
        RocketSalut rocket = new RocketSalut("Ракета 'Салют'");

        //Demo
        //Show boeing features
        boeing777.showInfo();
        boeing777.startHorizontalTakeoff();
        boeing777.fly();
        System.out.println(boeing777.getModel());

        //Show helicopter features
        mi8.showInfo();
        mi8.showTakeOffType();
        mi8.fly();

        //Service
        ManageFlyingObjects checker = new ManageFlyingObjects();
        checker.getFlyingObjectAction(boeing777);
        checker.getAircraftTakeoffType(boeing777);

        System.out.println(boeing777.tankerVolume);
        checker.addFuelToTanker(boeing777);
        System.out.println(boeing777.tankerVolume);
        boeing777.addFuel();
        System.out.println(boeing777.tankerVolume);
    }
}
