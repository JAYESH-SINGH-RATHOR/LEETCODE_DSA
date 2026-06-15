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
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[count];
                nums[count] = temp;
                count++;
            }
        }
    }
}
