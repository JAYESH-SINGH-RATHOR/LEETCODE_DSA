class Solution {
    public int[][] merge(int[][] intervals) {
       ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(intervals , (a , b)-> a[0] - b[0]);
        res.add(intervals[0]);
        for(int i = 0; i < intervals.length; i++){
            int u[] = intervals[i];
            int v[] = res.get(res.size() - 1);
            if(u[0] <= v[1]){
                u[0] = Math.min(u[0] , v[0]);
                v[1] = Math.max(u[1] , v[1]);
            }else{
                res.add(intervals[i]);
            }
        }
        int arr[][] = new int[res.size()][2];
        for(int i = 0; i < res.size(); i++){
            arr[i] = res.get(i);
        }
        return arr;
    }
}