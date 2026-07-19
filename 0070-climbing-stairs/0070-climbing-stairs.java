class Solution {

    // using bottom up technique
    public int climbStairs(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    // using memoization technique
    //     public int climbStairs(int n){
    //         int dp[] = new int[n + 1];
    //         return climbStairs1(n , dp);
    //     }
    // public int climbStairs1(int n , int dp[]) {
    //     if(n == 0){
    //         return 1;
    //     }
    //     if(n <= 2){
    //         return n;
    //     }
    //     return climbStairs1(n - 1 , dp) + climbStairs1(n - 2 , dp);
    // }
}