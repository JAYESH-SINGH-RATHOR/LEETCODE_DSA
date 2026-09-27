class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<int[] > q = new LinkedList<>();
        int time = 0;
        int freshOranges = 0;
        for(int  i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 2){
                    q.add(new int[] {i , j});
                }else if(grid[i][j] == 1){
                    freshOranges++;
                }
            }
        }
        int directions[][] = {
            {-1, 0}, // up
            {1, 0}, // down
            {0, -1}, // left 
            {0, 1} // right
        };
        while(!q.isEmpty() && freshOranges > 0){
            int size = q.size();
            for(int i = 0; i < size; i++){
                int curr[] = q.remove();
                int r = curr[0];
                int c = curr[1];
                for(int e[] : directions){
                    int nr = r + e[0];
                    int nc = c + e[1];
                    if(nr >= 0 && nr < n && nc >= 0 && nc < m && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        q.add(new int[]{nr ,nc});
                        freshOranges--;
                    }
                }
            }
            time++;
        }
        return freshOranges == 0 ? time :-1;
    }
}