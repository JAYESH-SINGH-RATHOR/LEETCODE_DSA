class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
       ArrayList<Integer> list = new ArrayList<>();
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       for(int i = 0; i < n; i++){
        min = Math.min(min , nums[i]);
        max = Math.max(max , nums[i]);
       }
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
       for(int i = min; i <= max; i++){
            if(!set.contains(i)){
                list.add(i);
            }
       }
        return list;
    }
}