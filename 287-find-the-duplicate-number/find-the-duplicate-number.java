
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

// optimized appraoch O(n log n )

// class Solution {
//     public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         int left = 0;
//         int right = 1;
//         while(right < nums.length){
//             if(nums[left] == nums[right]){
//                 return nums[left];
//             }
//             left++;
//             right++;
//         }
//         return -1;
//     }
// }

class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int e : nums){
            if(!map.containsKey(e)){
                map.put(e , 0);
            }
            int freq = map.get(e);
            map.put(e , freq + 1);
            if(map.get(e) > 1){
                return e;
            }
        }
        return -1;
    }
}