class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int n : nums){
            if(!map.containsKey(n)){
                map.put(n , 0);
            }
            int freq = map.get(n);
            map.put( n ,freq + 1);
        }
        for(int e : map.keySet()){
            if(map.get(e) > 1){
                return true;
            }
        }
        return false;
    }
}