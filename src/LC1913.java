import java.util.Arrays;
import java.util.Comparator;

public class LC1913 {
    public static void main(String[] args) {
        int[] numbers = {5,6,2,7,4};

        System.out.println(maxDifference(numbers));
    }

    public static int maxDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }
    public static int maxDifferenc1e(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }   public static int maxDiffere2nc1e(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[n - i - 1];
            nums[n - i - 1] = temp;
        }
        return (nums[n-1]*nums[n-2])-(nums[0]*nums[1]);
    }
}
