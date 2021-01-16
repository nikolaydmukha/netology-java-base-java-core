package home.javarush.javaCore.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

/* 
Факториал
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(input + " != " + factorial(input));
    }

    public static String factorial(int n) {
        //add your code here
        int result = 1;
        if(n == 0){
            return String.valueOf(1);
        }else if (n < 0){
            return String.valueOf(0);
        }else {
            result = n * Integer.parseInt(factorial(n-1));
        }

        return String.valueOf(result);
    }

}
