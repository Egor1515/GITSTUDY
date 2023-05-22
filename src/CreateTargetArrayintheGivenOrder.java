import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateTargetArrayintheGivenOrder {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 3};
        System.out.println(Arrays.toString(createTargetArray(arr, index)));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);

        }
        int[] target = new int[nums.length];
        for (int i = 0; i < target.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}
