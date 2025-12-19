class Solution {
    public int numTilings(int n) {
        int MOD = 1_000_000_007;

        long[] dp = new long[n + 1];
        long[] gap = new long[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2] + 2 * gap[i - 1]) % MOD;
            gap[i] = (gap[i - 1] + dp[i - 2]) % MOD;
        }

        return (int) dp[n];
    }
}
