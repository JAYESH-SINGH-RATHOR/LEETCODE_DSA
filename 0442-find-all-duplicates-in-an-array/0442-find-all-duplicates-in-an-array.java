class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer , Integer > map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int e:  nums){
            if(!map.containsKey(e)){
                map.put(e , 0);
            }
            int freq = map.get(e);
            map.put(e , freq + 1);
        }
        for(int e : map.keySet()){
            if(map.get(e) >= 2){
                res.add(e);
            }
            map.put(e , map.get(e) - 1);
        }
        return res;
    }
}