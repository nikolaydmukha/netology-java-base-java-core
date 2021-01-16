package home.netology.javabase.OOP.inheritance.cars.fueltype;

import home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Petrol extends VehicleTypeByFuelTypes {

    public Petrol() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PETROL.name();
    }
}
