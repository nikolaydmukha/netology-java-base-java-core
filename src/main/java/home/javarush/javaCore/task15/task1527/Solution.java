package home.javarush.javaCore.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String urlParams = url.substring(url.indexOf("?") + 1);
        ArrayList<String > params = new ArrayList<>(Arrays.asList(urlParams.split("&")));

        String forAlert = "";
        for (String param : params){
            System.out.printf("%s ", param.split("=")[0]);
            if (param.split("=")[0].equals("obj")){
                forAlert = param.split("=")[1];
            }
        }
        try {
            double value = Double.parseDouble(forAlert);
            alert(value);
        }catch (Exception ex){
            if (!forAlert.isEmpty()) {
                alert(forAlert);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("\ndouble: " + value);
    }

    public static void alert(String value) {
        System.out.println("\nString: " + value);
    }
}
