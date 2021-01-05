package main.java.home.netology.collections.hashmap.transportbase.transportеtype.abstractfactory;

import main.java.home.netology.collections.hashmap.transportbase.transportеtype.Truck;
import main.java.home.netology.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class TrucksFactory implements TransportFactory{

    public Truck createTransport(String number, String model, String color, EngineTypes engineType) {
        return new Truck(number, model, color, engineType);
    }
}
