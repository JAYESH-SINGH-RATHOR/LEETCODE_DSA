class Solution {
    // public void moveZeroes(int[] nums) {
    //     int insertPos = 0;

    //     for (int num : nums) {
    //         if (num != 0) {
    //             nums[insertPos++] = num;
    //         }
    //     }

    //     while (insertPos < nums.length) {
    //         nums[insertPos++] = 0;
    //     }
    // }

    // secound approach 

    public void moveZeroes(int[] nums) {
       int count = 0;
       for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                 count++;
            }
       }
    }
}
