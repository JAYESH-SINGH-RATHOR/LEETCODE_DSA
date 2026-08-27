class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer , Integer > map = new HashMap<>();
        for(int e : nums){
            if(!map.containsKey(e)){
                map.put(e ,  0);
            }
            int freq = map.get(e);
            map.put(e , freq + 1);
        }
        for(int e : map.keySet()){
            if(map.get(e) > 1){
                res.add(e);
            }
        }
        return res;
    }
}