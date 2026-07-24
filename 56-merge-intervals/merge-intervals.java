// class Solution {
//     public int[][] merge(int[][] intervals) {
//        if(intervals.length == 0){
//         return new int[0][0];
//        }
//        Arrays.sort(intervals , (a , b) -> a[0] - b[0]);
//         List<int[] > res = new ArrayList<>();

//         int start = intervals[0][0];
//         int end = intervals[0][1];

//         for(int i = 1; i < intervals.length; i++){
//             if(intervals[i][0] <= end){
//                 end = Math.max(end , intervals[i][1]);
//             }
//             else{
//                 res.add(new int[]{start,end});
//                 end = intervals[i][1];
//                 start = intervals[i][0];
//             }
//         }
//         res.add(new int[]{start , end});
//         return res.toArray(new int[res.size()][]);
//     }
// }



// bruteforce solution 

class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        for(int e[] : intervals){
            list.add(e.clone());
        }

        boolean MergeHappend = true;
        while(MergeHappend){
            MergeHappend = false; 
            for(int i = 0; i < list.size(); i++){
                int j = i + 1;
                while(j < list.size()){
                    int interval1[] = list.get(i);
                    int interval2[] = list.get(j);

                    if(isoverlapped(interval1 , interval2)){
                        interval1[0] = Math.min(interval1[0] , interval2[0]);
                        interval1[1] = Math.max(interval1[1] , interval2[1]); 
                        
                        list.remove(j); 
                        MergeHappend = true;
                    }else{
                        j++; 
                    }
                }
            }
        }
        
        int res[][] = new int[list.size()][2];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
    
    public boolean isoverlapped(int int1[] , int int2[]){
        return int1[1] >= int2[0] && int2[1] >= int1[0];
    }
}
