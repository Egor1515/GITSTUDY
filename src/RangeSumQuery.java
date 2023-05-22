class NumArray {
    private static int[] sum;

    public NumArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] += nums[i - 1];
//            this. = nums;
        }
    }

    public static int sum(int i, int j) {
        return sum[j] - (i == 0 ? 0 : sum[i - 1]);
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */