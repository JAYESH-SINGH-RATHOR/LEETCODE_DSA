 // bruteforce way 

// class Solution {
//     public int climbStairs(int n) {
//         if(n <= 2){
//             return n;
//         }
//         return climbStairs(n - 1) + climbStairs(n - 2);
//     }
// }

// optimized way 
    // method 1 > -> tabultaion Method(Bottom Up Method)
// class Solution{
//     public int climbStairs(int n){
//         if(n <= 2){
//             return n;
//         }
//         int dp[] = new int[n];
//         dp[0] = 1;
//         dp[1] = 2;
//         for(int i = 2; i < n; i++){
//             dp[i] = dp[i - 1 ] + dp[i - 2]; 
//         }
//         return dp[n - 1];
//     }
// }

// Method 2 -> memoization method (recursion Method) //

class Solution{
    public int climbStairs(int n){
        if(n <= 2){
            return n;
        }
        int dp[] = new int[n + 1];
        return recdp(n , dp);
    }
    int recdp(int n , int dp[]){
        if(n <= 2){
            return n;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = recdp(n - 1 , dp) + recdp(n - 2 , dp);
        return dp[n];
    }
}