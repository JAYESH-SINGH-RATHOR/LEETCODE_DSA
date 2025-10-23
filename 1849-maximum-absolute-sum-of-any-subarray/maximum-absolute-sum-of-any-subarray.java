class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSoFar = 0;  // biggest positive sum ending here
        int minSoFar = 0;  // biggest negative sum ending here
        int result = 0;    // final answer

        for (int i = 0; i < nums.length; i++) {
            // Update max positive sum ending here
            if (maxSoFar + nums[i] > nums[i]) {
                maxSoFar = maxSoFar + nums[i];
            } else {
                maxSoFar = nums[i];
            }

            // Update max negative sum ending here
            if (minSoFar + nums[i] < nums[i]) {
                minSoFar = minSoFar + nums[i];
            } else {
                minSoFar = nums[i];
            }

            // Update final answer with the biggest absolute sum
            result = Math.max(result, Math.max(maxSoFar, -minSoFar));
        }

        return result;
    }
}
