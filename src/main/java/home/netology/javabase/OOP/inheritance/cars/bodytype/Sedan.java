package home.netology.javabase.OOP.inheritance.cars.bodytype;

import home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Sedan extends VehicleTypeByBodyTypes {

    public Sedan() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.SEDAN.name();
    }
}
