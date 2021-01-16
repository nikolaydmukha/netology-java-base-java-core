package home.netology.javabase.OOP.inheritance.cars.purposetype;

import home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Car extends VehicleTypeByPurpose {

    public Car() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.CAR.name();
    }
}
