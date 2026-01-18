class Solution {
    public int maxArea(int[] height) {

        int maxwater = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int ht = Math.min(height[left], height[right]);
            int width = right - left;

            int currwater = ht * width;
            maxwater = Math.max(maxwater, currwater);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxwater;
    }
}
