package main.java.home.netology.javabase.OOP.inheritance.cars.purposetype;

import main.java.home.netology.javabase.OOP.inheritance.cars.VehicleType;

public class VehicleTypeByPurpose extends VehicleType {

    public VehicleTypeByPurpose() {
        super("Vehicle type by purpose");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;

        VehicleTypeByPurpose that = (VehicleTypeByPurpose) object;
        return attribute != null ? attribute.equals(that.attribute) : false;
    }
}
