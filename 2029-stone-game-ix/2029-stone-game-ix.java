class Solution {
    public boolean stoneGameIX(int[] stones) {
     int n = stones.length;
     int dp[] = new int[3];
        for(int e : stones){
            dp[e % 3]++;
        }
        if(dp[0] % 2 == 0){
            return dp[1] > 0 && dp[2] > 0;
        }
        return Math.abs(dp[1] - dp[2]) > 2;
    }
}