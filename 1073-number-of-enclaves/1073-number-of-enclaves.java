class Solution {
    static void helper(int grid[][], int m, int n, int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0) {
            return;
        }
        grid[i][j] = 0;
        int dir[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int d[]: dir) {
            helper(grid, m, n, i + d[0], j + d[1]);
        }
    }
    public int numEnclaves(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 || j == 0 || i == m - 1 || j == n - 1) && grid[i][j] == 1) {
                    helper(grid, m, n, i, j);
                }
            }
        }
        for (int i[]: grid) {
            for (int j: i) {
                if (j == 1) {
                    res++;
                }
            }
        }
        return res;
    }
}