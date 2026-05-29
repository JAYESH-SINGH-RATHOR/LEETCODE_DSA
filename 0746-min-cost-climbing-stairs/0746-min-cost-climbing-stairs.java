class Solution {
    // public int minCostClimbingStairs(int[] cost) {
    //     int n = cost.length;
    //     int dp[] = new int[n + 1];
    //     dp[0] = cost[0];
    //     dp[1] = cost[1];
    //     for(int i = 2; i < n; i++){
    //         dp[i] = cost[i] + Math.min(dp[ i - 1] , dp[i - 2]);
    //     }
    //     return Math.min(dp[n - 1] , dp[n - 2]);
    // }

    // second approach
    // public int minCostClimbingStairs(int[] cost) {
    //         int n = cost.length;
    //        return Math.min(solve(n - 1, cost) , solve(n - 2, cost));
    //     }
    
    // int solve(int n , int cost[]){
    //     if(n == 0){
    //         return cost[0];
    //     }
    //     if(n == 1){
    //         return cost[1];
    //     }
    //     return cost[n] + Math.min(solve(n - 1 , cost), solve(n - 2 , cost));
    // }

        // third approach will be memoization dp;

          public int minCostClimbingStairs(int[] cost) {
            int n = cost.length;
            int dp[] = new int[n + 1];
            Arrays.fill(dp , -1);
             return Math.min(
            solvemem(n - 1, cost, dp),
            solvemem(n - 2, cost, dp)
        );
          }
          int solvemem(int n , int cost[] , int dp[]){
            if(n == 0){
                return cost[0];
            }
            if(n == 1){
                return cost[1];
            }
            if(dp[n] != -1){
                return dp[n];
            }
            dp[n] = cost[n] + Math.min(solvemem(n - 1 , cost , dp) , solvemem(n - 2 , cost , dp));
            return dp[n];
          }
}