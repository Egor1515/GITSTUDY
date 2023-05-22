package ALGOBOOK;

import java.util.Arrays;

public class DivideAndConquer {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int sum = sumArray(arr);
        System.out.println(sum);
    }

    public static int sumArray(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        } else {
            int mid = arr.length / 2;
            int[] left = Arrays.copyOfRange(arr, 0, mid);
            int[] right = Arrays.copyOfRange(arr, mid, arr.length);
            int leftSum = sumArray(left);
            int rightSum = sumArray(right);
            return leftSum + rightSum;
        }
    }
}
