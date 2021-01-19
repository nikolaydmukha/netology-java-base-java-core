package home.netology.javacore.streams.numbers;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>() {{
            add(1);
            add(2);
            add(5);
            add(16);
            add(-1);
            add(-2);
            add(0);
            add(32);
            add(3);
            add(5);
            add(8);
            add(23);
            add(4);
        }};

        Iterator<Integer> itr = arr.iterator();

        while (itr.hasNext()) {
            Integer item = itr.next();
            if (item <= 0 || item % 2 != 0) {
                itr.remove();
            }
        }
        int tmp;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    tmp = arr.get(j + 1);
                    arr.set(j + 1, arr.get(j));
                    arr.set(j, tmp);
                }
            }
        }
        System.out.println(arr.toString());
    }
}
