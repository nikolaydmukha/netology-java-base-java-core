package main.java.home.netology.collections.hashmap.transportbase.transportеtype.abstractfactory;

import main.java.home.netology.collections.hashmap.transportbase.transportеtype.Tram;
import main.java.home.netology.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class TramsFactory implements TransportFactory{

    public Tram createTransport(String number, String model, String color, EngineTypes engineType) {
        return new Tram(number, model, color, engineType);
    }
}
