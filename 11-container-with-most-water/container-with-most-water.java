class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxwater = Integer.MIN_VALUE;
        while(left < right){
            int ht = Math.min(height[left] , height[right]);
            int wt = right - left;
            int currwater = ht * wt; 
            maxwater = Math.max(maxwater , currwater);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxwater;
    }
}