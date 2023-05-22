public class NumberofArithmeticTriplets {
    public static void main(String[] args) {
        System.out.println(arithmeticTriplets(new int[]{0, 1, 4, 6, 7, 10}, 3));
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0, j = i + 1, k = i + 2; i < nums.length; i++) {
            if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                count++;
            }
        }
        return count;
    }
}
