class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int count = 0;
        int mindist = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(nums[i] == target){
                mindist = Math.min(mindist , Math.abs(i - start));
            }
        }
        return mindist;
    }
}