package home.javarush.javaCore.task14.task1411;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        ArrayList<String> keys = new ArrayList<>(){{
            add("loser");
            add("user");
            add("proger");
            add("coder");
        }};

        while (true){
            String key = reader.readLine();
            if (!keys.contains(key)){
                break;
            }
            switch (key.toLowerCase(Locale.ROOT)){
                case "user":
                    person = new Person.User();
                    break;
                case "loser":
                    person = new Person.Loser();
                    break;
                case "proger":
                    person = new Person.Proger();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
            }

            doWork(person);

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User){
            ((Person.User) person).live();
        }else if (person instanceof Person.Loser){
            ((Person.Loser) person).doNothing();
        }else if (person instanceof Person.Coder){
            ((Person.Coder)person).writeCode();
        }else if (person instanceof Person.Proger){
            ((Person.Proger) person).enjoy();
        }
    }
}
