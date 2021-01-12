package main.java.home.netology.javabase.OOP.inheritance.cars.purposetype;

import main.java.home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Passenger extends VehicleTypeByPurpose {

    public Passenger() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }

}
