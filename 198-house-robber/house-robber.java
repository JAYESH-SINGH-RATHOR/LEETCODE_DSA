class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n + 1];
        Arrays.fill(dp , - 1);
        return rec(0 , nums , dp , n);
    }
    int rec(int i , int nums[] , int dp[] , int n){
        if(i >= n){
            return 0;
        }
        if(dp[i] != -1){
            return  dp[i];
        }
        int steal = nums[i] + rec( i  + 2 , nums ,dp , n );
        int notsteal = rec( i  +  1, nums ,dp , n );
        dp[i] = Math.max(steal , notsteal);
        return dp[i];
    }
}