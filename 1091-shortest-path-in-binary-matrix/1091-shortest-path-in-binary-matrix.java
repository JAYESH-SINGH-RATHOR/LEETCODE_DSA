class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if (grid[0][0] == 1 || grid[n-1][m-1] == 1) {
            return -1;
        }
        boolean visited[][] = new boolean[n][m];
        Queue<int[]>q = new LinkedList<>();
        int dr[] = {-1 , 1 , 0 , 0 , -1 , 1 , 1 , 1};
        int dc[] = {0 , 0 , -1 , 1 , -1  , 1, -1 , 1};
        visited[0][0] = true;
        q.add(new int[]{0 , 0 , 1});
        while(!q.isEmpty()){
            int curr[] = q.remove();
            int r = curr[0];
            int c = curr[1];
            int dist = curr[2];
            if(r == n - 1 && c == m - 1){
                return dist;
            }
            for(int k = 0; k < 8; k++){
                int nr = r + dr[k];
                int nc = c + dc[k];
                if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 0 && !visited[nr][nc]){
                    visited[nr][nc] = true;
                    q.add(new int[]{nr , nc , dist + 1});
                }
            }
        }
        return -1;
    }
}