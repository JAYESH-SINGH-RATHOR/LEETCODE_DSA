class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n == 1){
            return 1;
        }
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];
        for(int e[] : trust){
            int u = e[0];
            int v = e[1];
           outDegree[u]++;
           inDegree[v]++;
        }
       for(int i = 0; i <= n; i++){
        if(inDegree[i] == n - 1 && outDegree[i] == 0){
            return i;
            }
        }
       return -1;
    }
}