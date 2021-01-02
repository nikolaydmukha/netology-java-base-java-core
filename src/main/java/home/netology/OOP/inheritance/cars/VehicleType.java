package main.java.home.netology.OOP.inheritance.cars;

public class VehicleType {
    protected String attribute;

    public VehicleType(String attribute) {
        this.attribute = attribute;
    }
    public String getAttributeOfType() {
        return attribute;
    }

    public String getTypeName() {
        return "Some vehicle type name";
    }
}
