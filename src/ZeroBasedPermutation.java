import java.util.Arrays;

public class ZeroBasedPermutation {
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 5, 3, 4};
        System.out.println((Arrays.toString(Permutation(arr))));
    }

    public static int[] Permutation(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[arr[i]];
        }
        return answer;

    }
}
