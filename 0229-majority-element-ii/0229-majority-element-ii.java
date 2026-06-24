public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
                int n = nums.length;
            int minfreq = n / 3;
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int e : nums){
                if(!map.containsKey(e)){
                    map.put(e , 0);
                }
                // System.out.print(map);
                int freq = map.get(e);
                map.put(e , freq + 1);
            }
            for(int e : map.keySet()){
                int freq = map.get(e);
                if(freq > minfreq){
                    res.add(e);
                }
            }
    return res;

        // if (nums == null || nums.length == 0) return result;
        // int candidate1 = 0, candidate2 = 1;
        // int count1 = 0, count2 = 0;
        // for (int num : nums) {
        //     if (num == candidate1) {
        //         count1++;
        //     } else if (num == candidate2) {
        //         count2++;
        //     } else if (count1 == 0) {
        //         candidate1 = num;
        //         count1 = 1;
        //     } else if (count2 == 0) {
        //         candidate2 = num;
        //         count2 = 1;
        //     } else {
        //         count1--;
        //         count2--;
        //     }
        // }
        // count1 = 0;
        // count2 = 0;
        // for (int num : nums) {
        //     if (num == candidate1) count1++;
        //     else if (num == candidate2) count2++;
        // }

        // int n = nums.length;
        // if (count1 > n / 3) result.add(candidate1);
        // if (count2 > n / 3) result.add(candidate2);

        // return result;
    }
}
