package main.java.home.netology.OOP.inheritance.cars.purposetype;

import main.java.home.netology.OOP.inheritance.cars.VehicleTypeEnum;

public class Truck extends VehicleTypeByPurpose {

    public Truck() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
