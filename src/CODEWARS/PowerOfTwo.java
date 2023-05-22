package CODEWARS;

import java.util.Arrays;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(2)));
    }
    public static long[] powersOfTwo(int n){
        long[]arr = new long[n+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)Math.pow(n,i);
        }
        return arr;
    }
}
