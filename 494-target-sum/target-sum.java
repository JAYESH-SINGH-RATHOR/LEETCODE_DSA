class Solution {
    public int findTargetSumWays(int[] nums, int target) {
      return recursion(nums , 0 , 0 , target);
    }
    int recursion(int nums[] , int i , int sum , int target){
        if(i == nums.length){
            return sum == target ? 1 :  0;
        }
        int plus = recursion(nums , i + 1 , sum + nums[i] , target);
        int minus = recursion(nums , i + 1 , sum - nums[i] , target);
    return plus + minus;
    }
}