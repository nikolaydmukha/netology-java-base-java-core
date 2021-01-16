package home.netology.javabase.collections.hashmap.transportbase.transportеtype.abstractfactory;

import home.netology.javabase.collections.hashmap.transportbase.transportеtype.Motorcycle;
import home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class MotorcyclesFactory implements TransportFactory{

    public Motorcycle createTransport(String number, String model, String color, EngineTypes engineType) {
        return new Motorcycle(number, model, color, engineType);
    }
}
