package home.netology.javabase.OOP.inheritance.cars.bodytype;

import home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Pickup extends VehicleTypeByBodyTypes {

    public Pickup() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PICKUP.name();
    }
}
