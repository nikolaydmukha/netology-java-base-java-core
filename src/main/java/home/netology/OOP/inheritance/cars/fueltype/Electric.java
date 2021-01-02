package main.java.home.netology.OOP.inheritance.cars.fueltype;

import main.java.home.netology.OOP.inheritance.cars.VehicleTypeEnum;

public class Electric extends VehicleTypeByFuelTypes {

    public Electric() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.ELECTRIC.name();
    }
}
