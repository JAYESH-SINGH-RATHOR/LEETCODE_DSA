class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        // if (k == 1) {
        //     return -1;
        // }
        HashMap<Integer, Integer> map = new HashMap<>();
        // Har window ko check karo
        for (int i = 0; i <= n - k; i++) {
            HashMap<Integer, Integer> freq = new HashMap<>();
            // Current window ke elements
            for (int j = i; j < i + k; j++) {
                freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            }
            // Jo elements current window me present hain
            for (int num : freq.keySet()) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int ans = -1;
        // Jo exactly ek window me aaye
        for (int num : map.keySet()) {
            if (map.get(num) == 1) {
                ans = Math.max(ans, num);
            }
        }
        return ans;
    }
}

