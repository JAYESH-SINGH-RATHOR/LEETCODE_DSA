class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int median = nums[n / 2];
        int count = 0;
        for (int e : nums) {
            count += Math.abs(e - median);
        }
        return count;
    }
}