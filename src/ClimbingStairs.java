import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ClimbingStairs {
    public static void main(String[] args) {
//        System.out.println(climbingStairs(4));
        int[] arr = {1, 2, 3, 4, 1, 2, 4, 6, 5, 3};
        System.out.println(arr(arr));
    }

    public static int climbingStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        return climbingStairs(n - 1) + climbingStairs(n - 2);
    }

    public static List<Integer> arr(int[] nums) {
        int[] tmp = new int[nums.length + 1];

        for (int num : nums) {
            tmp[num] = num;
        }
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i] == 0) {
                list.add(i);
            }
        }
        return list;
    }
}
