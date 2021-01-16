package home.netology.javabase.collections.hashmap.transportbase.transportеtype;

import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.BodyTypes;
import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class Car extends BaseTransport {

    public Car(String number, String model, String color, EngineTypes engineType) {
        super(number, model, color, BodyTypes.PASSENGER, engineType);
    }

}
