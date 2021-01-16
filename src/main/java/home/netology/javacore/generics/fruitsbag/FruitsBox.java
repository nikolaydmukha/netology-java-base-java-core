package home.netology.javacore.generics.fruitsbag;

public class FruitsBox<K, V extends Fruits> {
    private K key;
    private V obj;

    public FruitsBox(K key, V obj) {
        this.key = key;
        this.obj = obj;
    }

    public V getObj() {
        return this.obj;
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

