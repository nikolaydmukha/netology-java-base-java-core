package home.netology.javabase.collections.hashmap.transportbase.transportеtype.abstractfactory;

import home.netology.javabase.collections.hashmap.transportbase.transportеtype.Truck;
import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class TrucksFactory implements TransportFactory{

    public Truck createTransport(String number, String model, String color, EngineTypes engineType) {
        return new Truck(number, model, color, engineType);
    }
}
