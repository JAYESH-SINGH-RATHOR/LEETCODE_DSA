class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int one = 0;
        int zero = 0;
        int maxlength = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                zero++;
            }
            while(zero > 1){
               if(nums[one] == 0){
                zero--;
               }
                one++;
            }
            maxlength = Math.max(maxlength , i - one);
        }
        return maxlength;
    }
}