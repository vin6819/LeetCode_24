class Solution {
    static int helper(int grid[][], int r, int c, int m, int n) {
        if (r < 0 || c < 0 || r >= m || c >= n || grid[r][c] == 0) {
            return 0;
        }
        int fish = grid[r][c];
        grid[r][c] = 0;
        fish += helper(grid, r, c + 1, m, n);
        fish += helper(grid, r, c - 1, m, n);
        fish += helper(grid, r + 1, c, m, n);
        fish += helper(grid, r - 1, c, m, n);
        return fish;
    }
    public int findMaxFish(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    res = Math.max(res, helper(grid, i, j, m, n));
                }
            }
        }
        return res;
    }
}