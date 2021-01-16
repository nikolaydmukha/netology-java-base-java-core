package home.netology.javabase.OOP.inheritance.cars.purposetype;

import home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Passenger extends VehicleTypeByPurpose {

    public Passenger() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.PASSENGER.name();
    }

}
