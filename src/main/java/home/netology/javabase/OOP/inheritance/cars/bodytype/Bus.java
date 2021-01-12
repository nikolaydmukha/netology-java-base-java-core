package main.java.home.netology.javabase.OOP.inheritance.cars.bodytype;

import main.java.home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Bus extends  VehicleTypeByBodyTypes {

    public Bus() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
