class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break; 
            }
        }
        Set<Integer> Set = new HashSet<>();
        for (int num : nums) {
            Set.add(num);
        }
        
        while (Set.contains(sum)) {
            sum++;
        }
        
        return sum;
    }
}
