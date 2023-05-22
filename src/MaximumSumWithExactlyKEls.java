public class MaximumSumWithExactlyKEls {
    public static void main(String[] args) {
        System.out.println(maximizeSum(new int[]{5,5,5},2));
    }

    public static  int maximizeSum(int[] nums, int k) {
        int maxVal = 0;
        int result = 0;

        for (int num : nums) {
            if (maxVal < num) maxVal = num;
        }
        for (int i = 0; i < k; i++) {
            result +=maxVal++;
        }
        return result;
    }
}
