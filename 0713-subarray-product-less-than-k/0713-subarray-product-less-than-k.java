class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // Set<Integer> set = new HashSet<>();
        // for(int e : nums){
        //     set.add(e);
        // }
        // int left = 0;
        // int mul = 1;
        // int count = 0;
        // for(int i = 0; i < nums.length; i++){
        //     mul *= nums[i];
        //     while(mul > k){
        //         mul -= nums[i];
        //         set.remove(left);
        //         left++;
        //     }
        //     count++;
        // }
        // return count;

        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int mul = 1;
            for(int j = i; j < nums.length; j++){
                mul *=  nums[j];
                if(mul < k){
                    count++;
                }
               else{
                break;
               }
            }
        }
        return count;
    }
}