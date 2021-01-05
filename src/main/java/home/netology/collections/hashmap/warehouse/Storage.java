package main.java.home.netology.collections.hashmap.warehouse;

import java.util.HashSet;

public class Storage {
    private String name;
    private String address;
    private HashSet<Product> storage;

    public Storage(String name, String address) {
        this.name = name;
        this.address = address;
        this.storage = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public HashSet<Product> getStorage() {
        return storage;
    }

}
