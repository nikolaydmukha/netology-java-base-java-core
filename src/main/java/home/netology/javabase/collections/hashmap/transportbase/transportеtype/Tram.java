package home.netology.javabase.collections.hashmap.transportbase.transportеtype;

import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.BodyTypes;
import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class Tram extends BaseTransport {

    public Tram(String number, String model, String color, EngineTypes engineType) {
        super(number, model, color, BodyTypes.TRAM, engineType);
    }
}

