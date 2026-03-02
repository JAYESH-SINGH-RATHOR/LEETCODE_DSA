class Solution {
    public int[] shuffle(int[] nums, int n) {
        int first [] = new int[ 2 * n];
        int idex = 0;
        for(int i = 0; i < n; i++){
            first[idex++] = nums[i];
            first[idex++] = nums[i + n];
        }
        return first;
    }
}