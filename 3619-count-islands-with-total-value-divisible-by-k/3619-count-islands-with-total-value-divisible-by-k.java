class Solution {
    public int countIslands(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        // krna kya hai -> 
       //  1 -> hme ye dekhna hai ki horizontally or vertically kon kon si value aa rhi hai jha pe 0 aayega whi tk ka sum calculate kr lena hai 
       // 2 -> hme ye dekhna hai ki kitne aaise pair bn rhe hai jinka add krne ke bad unka sum  k se divisable hai 
       // jo divisable honge unko count kr lena hai 
        int dr[] = {- 1 , 1 , 0 , 0};
        int dc[] = {0 , 0 , -1 , 1};
        boolean visited[][] = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        int count =  0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] > 0 && !visited[i][j]){
                    visited[i][j] = true;
                    q.add(new int[]{i , j});
                     long sum = 0;
                    while(!q.isEmpty()){
                        int curr[] = q.remove();
                        int r = curr[0];
                        int c = curr[1];
                        sum += grid[r][c];
                        for(int x = 0; x < 4; x++){
                            int nr = r + dr[x];
                            int nc = c + dc[x];
                            if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] > 0 && !visited[nr][nc]){
                                visited[nr][nc] = true;
                                q.add(new int[]{nr , nc});
                            //    sum += grid[nr][nc];
                            }
                        }
                    }
                    if(sum % k == 0){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}