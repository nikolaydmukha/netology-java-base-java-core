package main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.abstractfactory;

import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public interface TransportFactory<T> {

    T createTransport(String number, String model, String color, EngineTypes engineType);
}
