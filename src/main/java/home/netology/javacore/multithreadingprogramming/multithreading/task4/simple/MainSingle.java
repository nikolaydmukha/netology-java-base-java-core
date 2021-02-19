package home.netology.javacore.multithreadingprogramming.multithreading.task4.simple;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainSingle {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Date date = new Date();
        for (int i = 0; i < 100_000_000; i++) {
            numbers.add(date.getSeconds() * i);
        }

        Long start = date.getTime();
        Integer max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > max){
                max = numbers.get(i);
            }
        }
        Long finish = date.getTime();
        System.out.println("Затрачено: " + (finish - start));
        System.out.println(max);
    }
}
