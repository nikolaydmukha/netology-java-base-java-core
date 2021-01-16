package home.netology.javabase.collections.hashmap.warehouse;

public class Product {
    private int number;
    private String name;
    private double price;
    private double weight;


    public Product(int number, String name, Double price, double weight) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != getClass()) return false;
        Product other = (Product) obj;
        return name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(number).hashCode();
    }

}
