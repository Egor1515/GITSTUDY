package CODEWARS;

import java.math.BigInteger;

public class WilsonPrimeNumber {
    public static void main(String[] args) {
        long n = 5;
        System.out.println(am_i_wilson(0));
    }



    public static boolean am_i_wilson(int n) {
        if (n <= 1 || n == 4) return false;

        int factorial = 1;
        for (int i = 2; i < n; i++) {
            factorial = factorial * i % n;
        }
        return ((factorial * (n - 1) + 1) % (n * n) == 0);
    }
}