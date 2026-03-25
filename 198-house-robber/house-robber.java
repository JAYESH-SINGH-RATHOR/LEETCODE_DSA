class Solution {
    public int rob(int[] nums) {
         int n = nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp , -1);
            if(n == 0){
                return dp[n] = nums[0];
            }
            return robmem(nums , n - 1, dp);

         // using tabulation method //
        //  return robtab(nums);
    }
    // int robtab(int nums[]){
    //     int n = nums.length;
    //     if(n == 1){
    //         return nums[0];
    //     }
    //     int dp[] = new int[n];
    //     Arrays.fill(dp , -1);
    //     dp[0] = nums[0];
    //     dp[1] = Math.max(nums[0] ,nums[1]);
    //     for(int i = 2; i < n; i++){
    //         dp[i] = Math.max(nums[i] + dp[ i -2] , dp[i - 1]);
    //     }
    //     return dp[n - 1];
    // }

    // using memoization method //

    int robmem(int nums[] , int n , int dp[]){
        if( n == 0){
            return dp[n] = nums[0];
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = Math.max(nums[n] + robmem(nums , n - 2 , dp) , robmem(nums , n - 1 , dp));
    return dp[n];   
    }
}