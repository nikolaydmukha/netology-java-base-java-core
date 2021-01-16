package home.javarush.javaSyntax.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Найти и обезвредить
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //напишите тут ваш код
        for(int i = 0; i < list.size(); i++){
            if ("bug".equalsIgnoreCase(list.get(i))) {
                list.remove(i);
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //напишите тут ваш код
        Iterator<String> iter = list.iterator();
        while(iter.hasNext()){
            String str = iter.next();
            if ("bug".equalsIgnoreCase(str)) {
                iter.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //напишите тут ваш код
        ArrayList<String> copy = (ArrayList<String>) list.clone();
        for(String item : copy){
            if ("bug".equalsIgnoreCase(item)) {
                list.remove(list.indexOf(item));
            }
        }
    }
}
