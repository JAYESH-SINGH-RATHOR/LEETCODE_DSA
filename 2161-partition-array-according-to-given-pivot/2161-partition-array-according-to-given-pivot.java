class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int arr[] = new int[nums.length];
        int index = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot){
                arr[index] = nums[i];
                index++;
            } 
        }
        
        for(int k = 0; k < nums.length; k++ ){
                if (nums[k] == pivot) {
                arr[index] = nums[k];
                index++;
                }
              }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] > pivot){
                arr[index] = nums[j];
                index++;
            }
        }
        return arr;
    }
}