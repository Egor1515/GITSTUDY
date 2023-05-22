package CODEWARS;

import java.util.Arrays;

public class SetReducer {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(setReducer(5)));
    }

    public static int[][] setReducer(int n) {

        int[][] arr = new int[n][n];
        int n1 = arr.length;

        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n1; j++) {
                arr[i][(j + i) % n] = j + 1;
            }
        }
        return arr;
    }
}
