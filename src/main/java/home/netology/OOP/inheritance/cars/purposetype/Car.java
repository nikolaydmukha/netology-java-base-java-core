package main.java.home.netology.OOP.inheritance.cars.purposetype;

import main.java.home.netology.OOP.inheritance.cars.VehicleTypeEnum;

public class Car extends VehicleTypeByPurpose {

    public Car() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
