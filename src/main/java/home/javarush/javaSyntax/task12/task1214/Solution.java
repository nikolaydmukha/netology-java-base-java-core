package home.javarush.javaSyntax.task12.task1214;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Solution {
    public static ArrayList<String> programmingLanguages = new ArrayList<>(Arrays.asList("C", "C++", "Python", "JavaScript", "Ruby", "Java", "Pascal"));

    public static void main(String[] args) {
        System.out.println(programmingLanguages.toString());
        //напишите тут ваш код

        Iterator<String> fruitIterator = programmingLanguages.iterator();
        while(fruitIterator.hasNext()) {
            String fruit = fruitIterator.next();
            System.out.println(fruit);
            if (!"Java".equals(fruit)) {
                fruitIterator.remove();
            }
        }
    }
}
