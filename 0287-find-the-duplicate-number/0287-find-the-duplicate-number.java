
        // brute force appraoch
// class Solution {
//     public int findDuplicate(int[] nums) {
//        for(int i = 0; i < nums.length; i++){
//         for(int j = i + 1; j < nums.length; j++){
//             if(nums[i] == nums[j]){
//                 return nums[i];
//             }
//         }
//        }
//        return -1;
//     }
// }

// optimized appraoch 

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = 1;
        while(right < nums.length){
            if(nums[left] == nums[right]){
                return nums[left];
            }
            left++;
            right++;
        }
        return -1;
    }
}