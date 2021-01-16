package home.netology.javacore.generics.fruitsbag;

public class Main {
    public static void main(String[] args) {

        FruitsBox<String, Fruits> fruitBox = new FruitsBox<>("fruit", new Fruits());
        fruitBox.getObj().printClass();

        FruitsBox<String, Banana> bananaBox = new FruitsBox<>("banana", new Banana());
        bananaBox.getObj().printClass();

        FruitsBox<String, Apple> appleBox = new FruitsBox<>("apple", new Apple());
        appleBox.getObj().printClass();


        VegetablesBox<String, Veges> vegBox = new VegetablesBox<>("vegs", new Veges());
        vegBox.getObj().printClass();

        VegetablesBox<String, Carrot> cabbageBox = new VegetablesBox<>("cabbage", new Carrot());
        cabbageBox.getObj().printClass();
    }
}
