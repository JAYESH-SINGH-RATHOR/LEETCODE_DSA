class Solution {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean visited[][] = new boolean[n][m];
        int count = 0;
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                   ArrayList<int[]>server = new ArrayList<>();
                    visited[i][j] = true;
                    q.add(new int[]{i , j});
                    while(!q.isEmpty()){
                        int curr[] = q.remove();
                        int r = curr[0];
                        int c = curr[1];
                        server.add(new int[]{r , c});
                        for(int k = 0; k < m; k++){
                            if(grid[r][k] == 1 && !visited[r][k]){
                                visited[r][k] = true;
                                q.add(new int[]{r ,k});
                            }
                        }
                        for(int k = 0; k < n; k++){
                            if(grid[k][c] == 1 && !visited[k][c]){
                                visited[k][c] = true;
                                q.add(new int[]{k , c});
                            }
                        }
                    }
                    if(server.size() > 1){
                        count += server.size();
                    }
                }
            }
        }
        return count;
    }
}