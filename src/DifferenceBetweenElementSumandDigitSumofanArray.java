public class DifferenceBetweenElementSumandDigitSumofanArray {
    public static void main(String[] args) {
        System.out.println(sumDifference(new int[]{1, 15, 6, 3}));
    }

    public static int sumDifference(int[] nums) {
        int resArr = 0, resDigit = 0;
        for (int i = 0; i < nums.length; i++) {
            resArr += nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            while (nums[j] > 0) {
                int n = nums[j] % 10;
                resDigit += n;
                nums[j] /= 10;
            }
        }
        return resArr - resDigit;
    }
}
