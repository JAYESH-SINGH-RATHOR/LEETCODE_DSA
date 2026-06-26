class Solution {
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, word, 0, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, String word, int index, int x, int y, boolean[][] visited) {
        if (index == word.length()) return true;
        if (x < 0 || y < 0 || x >= board.length || y >= board[0].length) return false;
        if (visited[x][y] || board[x][y] != word.charAt(index)) return false;

        visited[x][y] = true;
        boolean found = dfs(board, word, index + 1, x + 1, y, visited) ||
                        dfs(board, word, index + 1, x - 1, y, visited) ||
                        dfs(board, word, index + 1, x, y + 1, visited) ||
                        dfs(board, word, index + 1, x, y - 1, visited);
        visited[x][y] = false;
        return found;
    }
}