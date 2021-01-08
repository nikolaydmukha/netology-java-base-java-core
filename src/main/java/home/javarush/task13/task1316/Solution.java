package main.java.home.javarush.task13.task1316;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] ints = JavarushQuest.values();
        for(JavarushQuest quest : ints){
            System.out.println(quest.ordinal());
        }
    }
}
