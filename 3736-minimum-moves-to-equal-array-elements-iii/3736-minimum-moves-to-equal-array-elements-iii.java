// class Solution {
//     public int minMoves(int[] nums) {
//         int count = 0;
//         int max = Integer.MIN_VALUE;
//         for(int e : nums){
//             max = Math.max(e , max);
//         }
//         for(int i = 0; i < nums.length; i++){
//             while(nums[i] != max){
//                 nums[i] += 1;
//                 count++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int e : nums){
            max = Math.max(e , max);
        }
        for(int e : nums){
            count += max - e;
        }
        return count;
    }
}