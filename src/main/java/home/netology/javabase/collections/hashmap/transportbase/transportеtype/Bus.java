package home.netology.javabase.collections.hashmap.transportbase.transportеtype;

import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.BodyTypes;
import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class Bus extends BaseTransport {

    public Bus(String number, String model, String color, EngineTypes engineType) {
        super(number, model, color, BodyTypes.BUS, engineType);
    }
}
