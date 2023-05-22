import java.util.Arrays;

public class averageSalary {
    public static int parcMethod(int[] arr) {
        int result = 0;
        Arrays.sort(arr);

        for (int i = 1; i <= arr.length - 2; i++) {
            result += arr[i];
        }
        return result / (arr.length - 2);
    }
}
