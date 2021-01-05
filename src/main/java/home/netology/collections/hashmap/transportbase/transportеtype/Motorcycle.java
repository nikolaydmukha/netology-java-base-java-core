package main.java.home.netology.collections.hashmap.transportbase.transportеtype;

import main.java.home.netology.collections.hashmap.transportbase.transportеtype.features.BodyTypes;
import main.java.home.netology.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class Motorcycle extends BaseTransport {

    public Motorcycle(String number, String model, String color, EngineTypes engineType) {
        super(number, model, color, BodyTypes.MOTORCYCLE, engineType);
    }
}
