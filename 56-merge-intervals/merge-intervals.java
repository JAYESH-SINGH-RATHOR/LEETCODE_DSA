class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a , b) -> Integer.compare(a[0] , b[0]));
        ArrayList<int[] > res= new ArrayList<>();
        res.add(intervals[0]);
        for(int i = 0; i < intervals.length; i++){
            int s[] = intervals[i];
            int e[] = res.get(res.size() - 1);
            if(s[0] <= e[1]){
              s[0] = Math.min(s[0] , e[0]);
              e[1] = Math.max(s[1] , e[1]);

            }else{
                res.add(intervals[i]);
            }  
        }
         int arr[][] = new int [res.size()][2];
            for(int i = 0; i < res.size(); i++){
                arr[i] = res.get(i);
            }
        return arr;
    }
}