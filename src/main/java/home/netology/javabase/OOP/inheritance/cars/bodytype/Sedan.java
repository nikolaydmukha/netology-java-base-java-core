package main.java.home.netology.javabase.OOP.inheritance.cars.bodytype;

import main.java.home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Sedan extends VehicleTypeByBodyTypes {

    public Sedan() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
