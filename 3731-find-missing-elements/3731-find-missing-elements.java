class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int min = Integer.MAX_VALUE;
       int max = Integer.MIN_VALUE;
       Set<Integer> set = new HashSet<>();
       List<Integer> list = new ArrayList<>();
       for(int i = 0; i < nums.length; i++){
        min = Math.min(nums[i] , min);
        max = Math.max(nums[i] , max);
       }
       for(int i = 0; i < nums.length; i++){
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