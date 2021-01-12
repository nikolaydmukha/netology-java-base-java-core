package main.java.home.netology.javacore.generics.sinmpletasks;

public class BigBox<K, T> {
    private K key;
    private T obj;

    public BigBox(K key, T obj) {
        this.key = key;
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "key=" + key +
                "; keyType=" + key.getClass().getName() +
                ", obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }

}
