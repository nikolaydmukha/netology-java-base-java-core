package main.java.home.netology.OOP.inheritance.cars.bodytype;

import main.java.home.netology.OOP.inheritance.cars.VehicleTypeEnum;

public class Wagon extends VehicleTypeByBodyTypes {

    public Wagon() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
