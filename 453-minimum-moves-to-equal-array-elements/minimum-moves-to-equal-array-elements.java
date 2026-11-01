class Solution {
    public int minMoves(int[] nums) {
        int move = 0;
        int min = Integer.MAX_VALUE;
        for(int e : nums){
            min = Math.min(min ,e);
        }
        for(int i : nums){
            move += i - min;
        }
        return move;
    }
}