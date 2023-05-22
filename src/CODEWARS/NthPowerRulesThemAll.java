package CODEWARS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NthPowerRulesThemAll {
    public static void main(String[] args) {
//        System.out.println(modifiedSum(new int[]{1,2,3},3));
//        System.out.println(Arrays.toString(digitize(35231)));
        System.out.println(reverseWords("Hello my name is"));
    }

    public static String reverseWords(String str) {
        String[] arr = str.trim().split(" ");
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return String.join(" ",arr);
    }

    public static int modifiedSum(int[] array, int power) {
        int sum = 0;
        for (int j : array) {
            sum = sum + (int) (Math.pow(j, power) - j);
        }
        return sum;

    }

    public static int[] digitize(int n) {
        if (n < 10) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        String number = Integer.toString(n);

        for (int i = number.length() - 1; i >= 0; i--) {
            char digit = number.charAt(i);
            int val = digit - '0';
            list.add(val);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
