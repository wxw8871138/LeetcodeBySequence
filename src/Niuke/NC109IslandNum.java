package Niuke;

public class NC109IslandNum {
    public int solve (char[][] grid) {
        // write code here
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    res++;
                    dfs(grid, i, j);
                }
            }
        }
        return res;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (!isInArea(grid, r, c)) {
            return;
        }
        if (grid[r][c] != '1') {
            return;
        }
        grid[r][c] = '2';
        dfs(grid, r-1, c);
        dfs(grid, r, c-1);
        dfs(grid, r+1, c);
        dfs(grid, r, c+1);
    }

    private boolean isInArea(char[][] grid, int r, int c) {
        return (r>=0 &&r < grid.length && c>=0 && c < grid[0].length);
    }
}
