class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean visited[] = new boolean[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            if(!visited[i]){
                count++;
                dfsUtil(i , isConnected , visited);
            }
        }
        return count;
    }
    void dfsUtil(int curr , int isConnected[][] , boolean visited[]){
        visited[curr] = true;
        for(int i = 0; i < isConnected.length; i++){
            if(!visited[i] && isConnected[curr][i] == 1){
                dfsUtil(i , isConnected , visited);
            }
        }
    }
}