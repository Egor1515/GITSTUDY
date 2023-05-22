import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 5;
        long[] memoization = new long[n + 1];
        Arrays.fill(memoization, -1);
        System.out.println(findNOTEffective(n, memoization));
    }

    public static long findNOTEffective(int n, long[] arr) {
        //TODO НЕ ЭФФЕКТИВНЫЙ МЕТОД

        if (arr[n] != -1) {
            return arr[n];
        }

        if (n <= 1) return n;
        long result = findNOTEffective(n - 1, arr) + findNOTEffective(n - 2, arr);
        arr[n] = result;
        return result;
    }

    public static long findEffective(int n) {

        long[] arr = new long[n + 1];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n];
    }


}