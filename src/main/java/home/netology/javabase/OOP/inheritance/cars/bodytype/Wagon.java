package home.netology.javabase.OOP.inheritance.cars.bodytype;

import home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Wagon extends VehicleTypeByBodyTypes {

    public Wagon() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.WAGON.name();
    }
}
