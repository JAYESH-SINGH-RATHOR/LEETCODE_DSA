class Solution {
    public int longestMonotonicSubarray(int[] nums) {
       int n = nums.length;
        int increment = 1;
        int decrement = 1;
        int max = 1;
        for(int i = 1; i < n; i++){
           if(nums[i] > nums[i - 1]){
                increment++;
                decrement = 1;
            }
            else if(nums[i] < nums[i - 1]){
                decrement++;
                increment = 1;
            }
            else{
                decrement = 1;
                increment = 1;
            }
        max = Math.max(max , Math.max(increment , decrement));
        }
        return max;
    }
}