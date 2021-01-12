package main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.abstractfactory;

import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.Bus;
import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class BusFactory implements TransportFactory{

    public Bus createTransport(String number, String model, String color, EngineTypes engineType) {
        return new Bus(number, model, color, engineType);
    }
}
