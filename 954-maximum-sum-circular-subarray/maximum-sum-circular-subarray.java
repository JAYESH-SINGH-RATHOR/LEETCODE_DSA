class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int n = nums.length;
      int totalsum = nums[0];
      int maxsum = nums[0];
      int currmax = nums[0];
      int minsum = nums[0];
      int currmin = nums[0];

      for(int i = 1; i < n; i++){
        currmax = Math.max(nums[i] , currmax + nums[i]);
        maxsum = Math.max(currmax , maxsum);

        currmin = Math.min(nums[i] , currmin + nums[i]);
        minsum = Math.min(minsum , currmin);

        totalsum += nums[i];
      }
      if(maxsum < 0){
        return maxsum;
      }
      return Math.max(maxsum , totalsum - minsum);
    }
}