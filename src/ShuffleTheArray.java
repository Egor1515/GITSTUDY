import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] result = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(shuffle(result, result.length / 2)));
    }

    public static int[] shuffle(int[] arr, int n) {
        int[] res = new int[n * 2];
        int i = 0, j = n;


        for (int k = 0; k < n * 2; k = k + 2) {
            res[k] = arr[i];
            res[k + 1] = arr[j];
            i++;
            j++;
        }
        return res;
    }
}
