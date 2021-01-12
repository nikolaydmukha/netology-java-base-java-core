package main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype;


import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.BodyTypes;
import main.java.home.netology.javabase.collections.hashmap.transportbase.transportеtype.features.EngineTypes;

public class BaseTransport {
    protected String number;
    protected String model;
    protected String color;
    protected BodyTypes type;
    protected EngineTypes engineType;

    public BaseTransport(String number, String model, String color, BodyTypes type, EngineTypes engineType) {
        this.number = number;
        this.model = model;
        this.color = color;
        this.type = type;
        this.engineType = engineType;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public BodyTypes getType() {
        return type;
    }

    public EngineTypes getEngineType() {
        return engineType;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + number.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that)
            return true;
        if (that == null)
            return false;
        if (getClass() != that.getClass())
            return false;
        BaseTransport other = (BaseTransport) that;
        if (number.hashCode() != other.number.hashCode())
            return false;
        return true;
    }
}
