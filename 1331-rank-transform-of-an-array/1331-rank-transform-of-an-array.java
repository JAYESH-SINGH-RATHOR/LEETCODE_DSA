// class Solution {
//     public int[] arrayRankTransform(int[] arr) {
//         ArrayList<Integer> index = new ArrayList<>();
//         for(int i = 0; i < arr.length; i++){
//             index.add(i);
//         }
//         Collections.sort(index , new Comparator<Integer>(){
//             public int compare(Integer x , Integer y){
//                 return arr[x] - arr[y];
//             }
//         });
//         int rank = 0;
//         int prev = Integer.MAX_VALUE;
//         int res[] = new int[arr.length];
//         for(int e : index){
//             if(prev != arr[e]){
//                 prev = arr[e];
//                 rank++;
//             }
//             res[e] = rank;
//         }
//         return res;
//     }
// }


// secound appraoch 

public class Solution {
     public int[] arrayRankTransform(int[] arr){
         TreeSet<Integer> set = new TreeSet<>();
       Map<Integer, Integer> map = new HashMap<>();
       for(int e : arr){
            set.add(e);
       }
       int rank = 1;
       for(int e : set){
            map.put(e , rank);
            rank++;
       }
       for(int i = 0; i < arr.length; i++){
        arr[i] = map.get(arr[i]);
       }
    return arr;
     }
}