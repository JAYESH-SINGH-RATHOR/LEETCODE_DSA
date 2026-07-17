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
       int curr = 1;
       int max = 1;
       for(int i = 1; i < nums.length; i++){
        if(nums[i] == nums[i - 1]){
            continue;
        }
        if(nums[i] - nums[i - 1] == 1){
            curr++;
        }else{
            curr = 1;
        }
        max = Math.max(curr , max);
       }
       return max;
    }
}
