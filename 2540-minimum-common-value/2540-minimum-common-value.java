class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        // bruteforce appraoch 

        // int n = nums1.length;
        // int m = nums2.length;
        // for(int i = 0; i < n ; i++){
        //     for(int j = 0; j < m; j++){
        //         if(nums1[i] == nums2[j]){
        //             return nums1[i];
        //         }
        //     }
        // }
        // return -1;

         HashSet<Integer> set = new HashSet<>();
        for(int x : nums1){
            set.add(x);
        }
        for(int x : nums2){
            if(set.contains(x)){
                return x;
            }
        }
        return -1;
    }
}