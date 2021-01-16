package home.netology.javabase.collections.hashmap.transportbase.transportеtype;

import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.BodyTypes;
import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class Truck extends BaseTransport {


    public Truck(String number, String model, String color, EngineTypes engineType) {
        super(number, model, color, BodyTypes.TRUCK, engineType);
    }
}
