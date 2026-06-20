public class Solution {
    // public int minSubArrayLen(int target, int[] nums) {
    //    int left = 0;
    //    int windowsize = Integer.MAX_VALUE;
    //    int sum = 0;
    //    for(int i = 0; i < nums.length; i++){
    //         sum += nums[i];
    //         while(sum >= target){
    //             windowsize = Math.min(windowsize , i - left + 1);
    //             sum -= nums[left];
    //             left++;
    //         } 
    //    }
    //         return windowsize == Integer.MAX_VALUE ? 0 : windowsize;
    // }

    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int size = Integer.MAX_VALUE;
        int sum = 0;
        int left = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            while(sum >= target){
                size = Math.min(size , i - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return size == Integer.MAX_VALUE ? 0 : size;
    }
}
