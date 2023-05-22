import java.util.Arrays;
import java.util.Map;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maxWealth(arr));
    }

    public static int maxWealth(int[][] arr) {
        int max = 0;
        for (int[] ints : arr) {
            int current = 0;
            for (int anInt : ints) {
                current += anInt;
            }
            max = Math.max(max, current);
        }
        return max;
    }
}
