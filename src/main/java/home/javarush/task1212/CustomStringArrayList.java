package main.java.home.javarush.task1212;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        //напишите тут ваш код
        String[] tempArray = elements.clone();
        elements = new String[capacity + capacity / 2];
        for(int i = 0; i < tempArray.length; i++){
            elements[i] = tempArray[i];
        }
        capacity += capacity / 2;

    }

}
