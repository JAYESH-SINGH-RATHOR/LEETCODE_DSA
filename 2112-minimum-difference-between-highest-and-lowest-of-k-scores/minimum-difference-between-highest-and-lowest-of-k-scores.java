class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        for(int i = 0; i <= n - k; i++){
                min = Math.min(min , nums[i + k - 1] - nums[i]);
        }
        return min;
    }
}