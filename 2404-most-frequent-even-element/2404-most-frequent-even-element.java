class Solution {
    public int mostFrequentEven(int[] nums) {
        int n = nums.length;
        int maxfreq = -1;
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i = 0; i < n; i++){
            if(nums[i] % 2 == 0){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i] , 0);
                }else{
                    int freq = map.get(nums[i]);
                    map.put(nums[i] , freq + 1);
                }
            }else{
                continue;
            }
        }
        int ans = -1;
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq > maxfreq){
                maxfreq = freq;
                ans = key;
            }else if(freq == maxfreq && key < ans){
                ans = key;
            }
        }
        return ans;
    }
}