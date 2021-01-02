package main.java.home.netology.OOP.inheritance.cars.fueltype;

import main.java.home.netology.OOP.inheritance.cars.VehicleTypeEnum;

public class Petrol extends VehicleTypeByFuelTypes {

    public Petrol() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
