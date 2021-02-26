package home.javarush.javaCore.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();

        t2.start();
        t2.join();

        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {

        private Scanner scanner = new Scanner(System.in);
        private List<String> chars = new ArrayList<>();

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                String input = scanner.nextLine();
                chars.add(input);
            }
        }
        public void printResult(){
            StringBuilder stringBuilder = new StringBuilder();
            for(String str : chars){
                stringBuilder.append(str).append(" ");
            }
            System.out.println(stringBuilder);
        }
    }
}
