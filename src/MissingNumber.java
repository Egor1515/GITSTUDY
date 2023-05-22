import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
    public static void main(String[] args) {

    }

    public static int missingNumber(int[] arr) {
//        Arrays.sort(arr);
//        int expected = 0;
//        for (int j : arr) {
//            if (expected != j)
//                break;
//            expected++;
//        }
//        return expected;
        int n = arr.length;
        int total = IntStream.of(arr).sum();
        return n * (n + 1) / 2 - total;

    }
}
