import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int[][] dist = new int[n][m];
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> q = new LinkedList<>();
        
        // 1. Add ALL 0s to the queue as starting points
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    visited[i][j] = true;
                    q.add(new int[]{i, j, 0}); // {row, col, distance}
                }
            }
        }
        
        int[] dr = {0, 0, 1, -1};
        int[] dc = {-1, 1, 0, 0};
        
        // 2. Expand outward layer by layer
        while (!q.isEmpty()) {
            int[] curr = q.remove();
            int r = curr[0];
            int c = curr[1];
            int wt = curr[2];
            
            dist[r][c] = wt;
            
            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                
                // Move to unvisited neighbors (which are guaranteed to be 1s)
                if (nr >= 0 && nr < n && nc >= 0 && nc < m && !visited[nr][nc]) {
                    visited[nr][nc] = true;
                    q.add(new int[]{nr, nc, wt + 1});
                }
            }
        }
        
        return dist;
    }
}
