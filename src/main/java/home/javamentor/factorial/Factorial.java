package main.java.home.javamentor.factorial;

import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        int value = 4;
        System.out.println(extracted(value));
        System.out.println(recursiveWay(value));
    }

    private static BigInteger extracted(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    private static BigInteger recursiveWay(int value) {

        BigInteger result = BigInteger.valueOf(1);
        if ((value == 1) || (value == 0)) {
            return BigInteger.valueOf(1);
        }
        return BigInteger.valueOf(value).multiply(recursiveWay(value - 1));
    }

    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n - 1);
        return result;
    }
}
