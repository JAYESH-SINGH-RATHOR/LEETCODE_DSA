class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int e : nums){
            if(!map.containsKey(e)){
                map.put(e , 0);
            }
            int freq = map.get(e);
            map.put(e , freq + 1);
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > 1){
               return key;
            }
        }
        return -1;
    //     int slow = nums[0];
    //     int fast = nums[0];
    //     do{
    //         slow = nums[slow];
    //         fast = nums[nums[fast]];
    //     }
    //     while(slow != fast);
    //     slow = nums[0];
    //     while(slow != fast){            
    //     slow = nums[slow];
    //     fast = nums[fast];
    //     }
    // return slow;
    }
}