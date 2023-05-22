import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3, n = 3;
        System.out.println(Arrays.toString(mergerTwo(nums1, m, nums2, n)));


    }

    public static int[] mergerTwo(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
        int pointer2 = n - 1;
        int finished = n + m - 1;
        while (pointer1 >= 0 && pointer2 >= 0) {
            nums1[finished--] = (nums1[pointer1] > nums2[pointer2]) ?
                    nums1[pointer1--] : nums2[pointer2--];
        }
        while (pointer2 >= 0) {
            nums1[finished--] = nums2[pointer2--];

        }
        return nums1;
    }
}