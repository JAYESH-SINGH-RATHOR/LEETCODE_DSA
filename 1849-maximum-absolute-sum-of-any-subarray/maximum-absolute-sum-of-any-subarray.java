class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        int maxSum = 0;   // max subarray sum ending here
        int minSum = 0;   // min subarray sum ending here
        int res = 0;      // result

        for (int i = 0; i < n; i++) {
            maxSum = Math.max(nums[i], maxSum + nums[i]);
            minSum = Math.min(nums[i], minSum + nums[i]);
            res = Math.max(res, Math.max(maxSum, -minSum));
        }

        return res;
    }
}
