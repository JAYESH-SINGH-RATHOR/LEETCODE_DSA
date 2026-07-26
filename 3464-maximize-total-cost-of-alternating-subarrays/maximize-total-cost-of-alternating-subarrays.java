class Solution {
    public long maximumTotalCost(int[] nums) {
        int n = nums.length;
        // dp0 tracks the max cost if the current element is ADDED (starts or resets a state)
        // dp1 tracks the max cost if the current element is SUBTRACTED (follows an addition)
        long dp0 = nums[0];
        long dp1 = nums[0]; // Base case for single element

        for (int i = 1; i < n; i++) {
            // To add nums[i], we take the max of the previous two states
            long nextDp0 = Math.max(dp0, dp1) + nums[i];
            
            // To subtract nums[i], it MUST follow an addition (dp0)
            long nextDp1 = dp0 - nums[i];

            dp0 = nextDp0;
            dp1 = nextDp1;
        }

        // The answer is the maximum possible cost at the end of the array
        return Math.max(dp0, dp1);
    }
}
