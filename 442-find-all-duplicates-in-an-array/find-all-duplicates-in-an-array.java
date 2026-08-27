// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         ArrayList<Integer> res = new ArrayList<>();
//         HashMap<Integer , Integer > map = new HashMap<>();
//         for(int e : nums){
//             if(!map.containsKey(e)){
//                 map.put(e ,  0);
//             }
//             int freq = map.get(e);
//             map.put(e , freq + 1);
//         }
//         for(int e : map.keySet()){
//             if(map.get(e) > 1){
//                 res.add(e);
//             }
//         }
//         return res;
//     }
// }


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer > res = new ArrayList<>();
        int arr[] = new int[nums.length + 1];
         for (int num : nums) {
            arr[num]++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        for (int i = 1; i <= nums.length; i++) {
            if (arr[i] == 2) {
                res.add(i);
            }
        }

        return res;
    }
}