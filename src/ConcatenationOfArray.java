import java.util.Arrays;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(concatenateArrs(arr)));
    }

    public static int[] concatenateArrs(int[] arr) {
        int index = 0,length = arr.length;
        int[] result = new int[length * 2];

        System.arraycopy(arr, 0, result, 0, arr.length);

        for (int i = arr.length; i < result.length; i++) {
            result[i] = arr[index];
            index++;
        }
        return result;
    }
}
