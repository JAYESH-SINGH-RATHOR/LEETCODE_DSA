class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        int left = 0;
        long maxsum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(!map.containsKey(nums[i])){
                map.put(nums[i] , 0);
            }
            int freq = map.get(nums[i]);
            map.put(nums[i] , freq + 1);

            if(i - left + 1 > k){
                sum -= nums[left];
                map.put(nums[left] , map.get(nums[left]) - 1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            if(i - left + 1 == k && map.size() == k){
                maxsum  = Math.max(maxsum , sum);
            }
        }
        return maxsum;
    }
}