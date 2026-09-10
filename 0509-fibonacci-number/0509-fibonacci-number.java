// using recursion
// class Solution {
//     public int fib(int n) {
//         if(n == 0){
//             return 0;
//         }
//         if(n < 3){
//             return 1;
//         }
//         return fib(n - 1) + fib(n - 2);
//     }
// }

// using memozation dp 

class Solution {
    public int fib(int n) {
        int dp[] = new int[n + 1];
        return fabmem(n , dp);
    }
    int fabmem(int n , int dp[]){
        if(n == 0){
            return 0;
        }
        if(n < 3){
            return 1;
        }
        if(dp[n] != 0){
            return dp[n];
        }
        dp[n] = fabmem(n - 1 , dp) + fabmem( n - 2 , dp);
        return dp[n];
    }
}