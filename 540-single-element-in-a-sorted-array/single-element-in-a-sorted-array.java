class Solution {
    public int singleNonDuplicate(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int e : nums){
            if(!map.containsKey(e)){
                map.put(e , 1);
            }
            else{
                int freq = map.get(e);
                map.put(e , freq + 1);
            }
        }
        for(int e : nums){
            if(map.get(e) == 1){
                return e;
            }
        }
        return -1;
    }
}