package main.java.home.netology.collections.hashmap.transportbase.transportеtype;

import main.java.home.netology.collections.hashmap.transportbase.transportеtype.features.BodyTypes;
import main.java.home.netology.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class Car extends BaseTransport {

    public Car(String number, String model, String color, EngineTypes engineType) {
        super(number, model, color, BodyTypes.PASSENGER, engineType);
    }

}
