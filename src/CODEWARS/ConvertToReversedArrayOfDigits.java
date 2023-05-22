package CODEWARS;

import java.util.Arrays;

public class ConvertToReversedArrayOfDigits {
    public static void main(String[] args) {
        String s = Integer.toString(141);
        System.out.println(s.charAt(1));
        System.out.println(Arrays.toString(conv(35231)));
    }
    public static int[]conv(int n){
        String len = Integer.toString(n);
        int[]arr = new int[len.length()];
        for (int i =0; i<arr.length; i++) {
           char digitChar = len.charAt(i);
           int digit = Character.getNumericValue(digitChar);
            arr[len.length()-1-i]=digit;
        }
        return arr;
    }
}
