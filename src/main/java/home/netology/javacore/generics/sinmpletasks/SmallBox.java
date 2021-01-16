package home.netology.javacore.generics.sinmpletasks;

public class SmallBox<T>{

    private T obj;

    public SmallBox(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return "Box{" +
                "obj=" + obj +
                "; objType=" + obj.getClass().getName() +
                '}';
    }
}

