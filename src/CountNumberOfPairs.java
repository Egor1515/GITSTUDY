public class CountNumberOfPairs {
    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{3,2,1,5,4},2));
    }

    public static int countKDifference(int[] nums, int k) {
        int sum = 0;

        for (int curr : nums) {
            for (int num : nums) {
                if (curr - num == k) {
                    sum ++;
                }
            }
        }
        return sum;
    }
}
