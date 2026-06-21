public class Solution {
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     Set<Integer> set = new HashSet<>();

    //     for (int i = 0; i < nums.length; i++) {
    //         if (set.contains(nums[i])) {
    //             return true;
    //         }

    //         set.add(nums[i]);

    //         if (set.size() > k) {
    //             set.remove(nums[i - k]);
    //         }
    //     }

    //     return false;
    // }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Set<Integer>set = new HashSet<>();
        for(int i = 0; i < n && i < k; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        for(int i = k; i < n; i++){
            int window = nums[i - k];
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            set.remove(window);
        }
        return false;
    }
}
