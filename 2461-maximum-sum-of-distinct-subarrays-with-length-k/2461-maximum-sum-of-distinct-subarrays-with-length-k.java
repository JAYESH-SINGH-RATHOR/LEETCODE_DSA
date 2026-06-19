class Solution {
        public long maximumSubarraySum(int[] nums, int k) {
            int n = nums.length;
            long sum = 0;
            long maxsum = 0;
            int dups = 0;
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int i = 0; i < k; i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i] , 0);
                }
                map.put(nums[i] , map.get(nums[i]) + 1);
                if(map.get(nums[i]) > 1){
                    dups += 1;
                }
                sum += nums[i];
            }
            if(dups == 0){
                maxsum = Math.max(maxsum , sum);
            }
            for(int i = k; i < n; i++){
                int numtoadd = nums[i];
                int numtoremove = nums[i - k];
                if(!map.containsKey(nums[i])){
                    map.put(nums[i] , 0);
                }
                map.put(nums[i] , map.get(nums[i] ) + 1);
                if(map.get(nums[i]) > 1){
                    dups += 1;
                }
                sum += numtoadd;
                if(map.get(numtoremove) > 1){
                    dups -= 1;
                }
                map.put(numtoremove , map.get(numtoremove) - 1);
                sum -= numtoremove;
                if(dups == 0){
                    maxsum = Math.max(maxsum , sum);
                }
            }
            return maxsum;
        }

    // public long maximumSubarraySum(int[] nums, int k) {
    //    int n = nums.length;
    //    long sum = 0;
    //    long maxsum = 0;
    //    int dups = 0;       

    //     // bruteforce appraoch

    //     for(int i = 0; i <= n - k; i++){
    //         sum  = 0;
    //         Set<Integer>set = new HashSet<>();
    //         boolean isdup = false;
    //         for(int j= i; j <= i + k - 1; j++){
    //             if(set.contains(nums[j])){
    //                 isdup = true;
    //                 break;
    //             }
    //             set.add(nums[j]);
    //             sum += nums[j];
    //         }
    //         if(!isdup){
    //             maxsum = Math.max(maxsum , sum);
    //         }
    //     }
    //     return maxsum;

    // }
}