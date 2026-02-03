class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxsum = sum;
        for(int j = k; j < n; j++){
            sum = sum + nums[j] - nums[j - k];
            maxsum = Math.max(maxsum , sum);
        }
        return (double) maxsum / k;
    }
}