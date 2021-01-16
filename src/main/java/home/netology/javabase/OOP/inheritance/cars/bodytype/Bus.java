package home.netology.javabase.OOP.inheritance.cars.bodytype;

import home.netology.javabase.OOP.inheritance.cars.VehicleTypeEnum;

public class Bus extends  VehicleTypeByBodyTypes {

    public Bus() {
        super();
    }

    @Override
    public String getTypeName() {
        return VehicleTypeEnum.BUS.name();
    }
}
