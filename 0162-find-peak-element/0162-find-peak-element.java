class Solution {
    public int findPeakElement(int[] nums) {
        // Arrays.sort(nums);
        int left = 0;
        int peak = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] < nums[mid + 1]){
                peak = mid;
                left = mid + 1;
            }else{
                right= mid;
            }
        }
        return left;
    }
}