class Solution {
    public int lengthOfLIS(int[] nums) {
        int  n = nums.length;

        // set is used for to store the unique elements in the arrays

        HashSet<Integer>set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        int m = set.size();
        int dp[][] = new int[n + 1][m  + 1]; 
        int arr[] = new int[m];
        int j = 0;
        for(int i : set){
            arr[j++] = i;
        }
        Arrays.sort(arr);
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= m; k++){
                if(nums[i - 1] == arr[k - 1]){
                    dp[i][k] = 1 + dp[i - 1][k - 1];
                }else{
                    dp[i][k] = Math.max(dp[i - 1][k] , dp[i][k - 1]);
                }
            }
        }
        return dp[n][m];
    }
}