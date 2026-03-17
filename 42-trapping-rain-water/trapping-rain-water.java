class Solution {
    public int trap(int[] height) {
       int n = height.length;
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for(int i = 1; i < n; i++){
            leftmax[i] = Math.max(leftmax[i - 1] , height[i]);
        }
        for(int i = n - 2; i >= 0; i--){
            rightmax[i] = Math.max(rightmax[i + 1] , height[i]);
        }
        int trappedwater = 0;
        for(int j = 0; j < n; j++){
            int waterlevel = Math.min(leftmax[j] , rightmax[j]);
            trappedwater += waterlevel - height[j];
        }
        return trappedwater;
    }
}
