class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int maxwater = 0;
        int left = 0;
        int right = n - 1;
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
