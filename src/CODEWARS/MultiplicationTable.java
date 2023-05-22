package CODEWARS;

import java.util.Arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(multiplicationTable(3)));
    }
    public static int [][] multiplicationTable(int n){
        int in = 1;
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length;j++) {
                arr[i][j] = (i + 1) * (j + 1);

            }
        }
        return arr;
    }
}
