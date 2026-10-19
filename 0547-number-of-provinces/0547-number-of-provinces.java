class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean visited[] = new boolean[n];
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                count++;
                dfsUtil(i , visited , isConnected);
            }
        }
        return count;
    }
     void dfsUtil(int curr , boolean visited[] , int isConnected[][]){
            visited[curr] = true;
            for(int i = 0; i < isConnected.length; i++){
                if(!visited[i] && isConnected[curr][i] == 1){
                    dfsUtil(i , visited , isConnected);
                }
            }
        }
}