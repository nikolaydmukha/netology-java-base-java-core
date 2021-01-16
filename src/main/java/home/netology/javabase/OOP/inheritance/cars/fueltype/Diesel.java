package home.netology.javabase.OOP.inheritance.cars.fueltype;

import home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Diesel extends VehicleTypeByFuelTypes {

    public Diesel() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.DIESEL.name();
    }
}
