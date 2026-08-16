// class Solution {
//     public int fib(int n) {
//         if(n == 0){
//             return 0;
//         }
//         if(n <= 2){
//             return 1;
//         }
//         return fib(n - 1) + fib(n - 2);
//     }
// }

// using tabulation dp 

// class Solution {
//     public int fib(int n) {
//       if(n == 0){
//         return 0;
//       }
//       int dp[] = new int[n + 1];
//       dp[0] = 0;
//       dp[1] = 1;
//       for(int i = 2; i <= n; i++){
//         dp[i] = dp[i - 1] + dp[i - 2];
//       }
//       return dp[n];
//     }
// }


// using memoization dp

class Solution {
    public int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n <= 2){
            return 1;
        }
        int dp[] = new int[n + 1];
        return recdp(n , dp);
    }
    int recdp(int n , int dp[]){
        if(n <= 2){
            return 1;
        }
        dp[n] = recdp(n - 1 , dp) + recdp(n - 2 , dp);
        return dp[n];
    }
}