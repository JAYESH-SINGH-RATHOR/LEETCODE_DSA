class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int  n = nums.length;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                for(int j = i + 1; j < n - 1; j++){
                    nums[j] = nums[j  + 1];
                }
                n--;
                i--;
            }
        }    
        return n;
    }
}













































//    if (nums.length == 0)
//         {
//              return 0;
//         }
//         int i = 0; 
//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != nums[i]) {
//                 i++;
//                 nums[i] = nums[j];
//             }
//         }
//         return i + 1;