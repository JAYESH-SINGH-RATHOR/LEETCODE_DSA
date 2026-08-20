class Solution {
    public int[] resultArray(int[] nums) {
       int res[] = new int[nums.length];
       List<Integer> arr1 = new ArrayList<>();       
       List<Integer> arr2 = new ArrayList<>();    
       arr1.add(nums[0]);
       arr2.add(nums[1]);  
    for(int i = 2; i < nums.length; i++){
        int arr1last = arr1.get(arr1.size() - 1);
        int arr2last = arr2.get(arr2.size() - 1);
        if(arr1last > arr2last){
            arr1.add(nums[i]);
        }else{
            arr2.add(nums[i]);
        }
    }
    int idx = 0;
    for(int i = 0; i < arr1.size(); i++){
        res[idx++] = arr1.get(i);
    }
    for(int i = 0; i < arr2.size(); i++){
        res[idx++] = arr2.get(i);
    }
    return res;
    }
}