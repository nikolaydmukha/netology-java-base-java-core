package main.java.home.javarush.javaSyntax.task17.task1715;

import java.util.ArrayList;

/* 
Вилларибо и Виллабаджо.
*/

public class Solution {
    static ArrayList<Keyboard> keyboardOrchestra = new ArrayList<>();
    static ArrayList<Stringed> stringedOrchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playKeyboardOrchestra();
        playStringedOrchestra();
    }


    public static void createKeyboardOrchestra(){
        //напишите тут ваш код
        keyboardOrchestra.add(new Piano());
        keyboardOrchestra.add(new Piano());
        keyboardOrchestra.add(new Piano());
        keyboardOrchestra.add(new Organ());
    }

    public static void createStringedOrchestra(){
        //напишите тут ваш код
        stringedOrchestra.add(new Guitar());
        stringedOrchestra.add(new Violin());
        stringedOrchestra.add(new Violin());
    }

    public static void playKeyboardOrchestra(){
        //напишите тут ваш код
        for(int i = 0; i < keyboardOrchestra.size(); i++){
            keyboardOrchestra.get(i).playKeys();
        }
    }


    public static void playStringedOrchestra(){
        //напишите тут ваш код
        for(int i = 0; i < stringedOrchestra.size(); i++){
            stringedOrchestra.get(i).playStrings();
        }
    }

}
