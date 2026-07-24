class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));
       ArrayList<int[]> list = new ArrayList<>();
       list.add(intervals[0]);
       for(int i = 1; i < intervals.length; i++){
        int end[] = list.get(list.size() - 1);
        int curr[] = intervals[i];
        if(curr[0] <= end[1]){
            curr[0] = Math.min(curr[0] , end[0]);
            end[1] = Math.max(curr[1] , end[1]);
        }else{
            list.add(intervals[i]);
        }
       }
       int res[][] = new int[list.size()][2];
       for(int i = 0; i < list.size(); i++){
        res[i] = list.get(i);
       }
       return res;
    }
}



// bruteforce solution 

// class Solution {
//     public int[][] merge(int[][] intervals) {
//         ArrayList<int[]> list = new ArrayList<>();
//         for(int e[] : intervals){
//             list.add(e.clone());
//         }

//         boolean MergeHappend = true;
//         while(MergeHappend){
//             MergeHappend = false; 
//             for(int i = 0; i < list.size(); i++){
//                 int j = i + 1;
//                 while(j < list.size()){
//                     int interval1[] = list.get(i);
//                     int interval2[] = list.get(j);

//                     if(isoverlapped(interval1 , interval2)){
//                         interval1[0] = Math.min(interval1[0] , interval2[0]);
//                         interval1[1] = Math.max(interval1[1] , interval2[1]); 
                        
//                         list.remove(j); 
//                         MergeHappend = true;
//                     }else{
//                         j++; 
//                     }
//                 }
//             }
//         }
        
//         int res[][] = new int[list.size()][2];
//         for(int i = 0; i < list.size(); i++){
//             res[i] = list.get(i);
//         }
//         return res;
//     }
    
//     public boolean isoverlapped(int int1[] , int int2[]){
//         return int1[1] >= int2[0] && int2[1] >= int1[0];
//     }
// }
