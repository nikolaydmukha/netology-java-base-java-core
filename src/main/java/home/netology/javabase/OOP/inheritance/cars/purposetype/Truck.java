package home.netology.javabase.OOP.inheritance.cars.purposetype;

import home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Truck extends VehicleTypeByPurpose {

    public Truck() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.TRUCK.name();
    }
}
