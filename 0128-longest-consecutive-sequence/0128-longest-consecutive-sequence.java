public class Solution {
    // public int longestConsecutive(int[] nums) {
    //     if (nums == null || nums.length == 0) return 0;
    //     Set<Integer> numSet = new HashSet<>();
    //     for (int num : nums) {
    //         numSet.add(num);
    //     }
    //     int longestStreak = 0;
    //     for (int num : numSet) {
    //         if (!numSet.contains(num - 1)) {
    //             int currentNum = num;
    //             int currentStreak = 1;

    //             while (numSet.contains(currentNum + 1)) {
    //                 currentNum++;
    //                 currentStreak++;
    //             }

    //             longestStreak = Math.max(longestStreak, currentStreak);
    //         }
    //     }
    //     return longestStreak;
    // }

    // secound appraoch // 

    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int count = 1;
        int maxcount = 1;
        for(int i = 1; i < n; i++){
            int diff = 0;
            diff = nums[i] - nums[i - 1];
            if(diff == 1){
                count++;
                maxcount = Math.max(maxcount , count);
            }else if(diff > 1){
                count = 1;
            }
        }
        return maxcount;
    }
}
