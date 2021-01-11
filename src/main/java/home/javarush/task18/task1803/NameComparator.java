package main.java.home.javarush.task18.task1803;

import java.util.Comparator;

/* 
Наставники JavaRush
*/

public class NameComparator implements Comparator<JavaRushMentor>{
    //напишите тут ваш код

    @Override
    public int compare(JavaRushMentor mentor1, JavaRushMentor mentor2) {
        int diff = mentor1.getName().length() - mentor2.getName().length();
        if (diff > 0){
            return 1;
        }else if (diff < 0){
            return -1;
        }else{
            return 0;
        }
    }
}
