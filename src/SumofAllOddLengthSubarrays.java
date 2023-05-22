public class SumofAllOddLengthSubarrays {
    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1, 2, 3, 4, 5}));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        for (int len = 1; len <= n; len += 2) { // iterate over all odd lengths
            for (int i = 0; i <= n - len; i++) { // iterate over all starting indices
                for (int j = i; j < i + len; j++) { // compute the sum of the subarray
                    sum += arr[j];
                }
            }
        }
        return sum;
    }
}
