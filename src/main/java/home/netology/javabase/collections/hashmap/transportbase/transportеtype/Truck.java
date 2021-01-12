package main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype;

import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.BodyTypes;
import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class Truck extends BaseTransport {


    public Truck(String number, String model, String color, EngineTypes engineType) {
        super(number, model, color, BodyTypes.TRUCK, engineType);
    }
}
