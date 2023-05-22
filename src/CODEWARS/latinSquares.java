package CODEWARS;

import java.util.Arrays;
import java.util.Random;

public class latinSquares {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(makeLatinSquare(5)));
    }
    public static int[][] makeLatinSquare(int n) {
        final int[][] latinSquare = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                latinSquare[i][(i+j)%n] = j+1;
            }
        }
        return latinSquare;
    }

}
