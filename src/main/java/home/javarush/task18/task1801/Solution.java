package main.java.home.javarush.task18.task1801;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Две реализации одного интерфейса
*/

public class Solution {
    public static ArrayList<Runnable> list = new ArrayList<>();

    public static void main(String[] args) {
        addToList(new Car());
        addToList(new Plane());

        runList();
    }

    public static void addToList(Runnable runnable) {
        //напишите тут ваш код
        list.add(runnable);
    }

    public static void runList() {
        //напишите тут ваш код
        Iterator<Runnable> itr = list.iterator();
        while (itr.hasNext()){
            itr.next().run();
        }
    }
}