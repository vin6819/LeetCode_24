class Solution {
    public int countServers(int[][] grid) {
        int m = grid.length, n = grid[0].length, res = 0;
        int r[] = new int[m], c[] = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    r[i]++;
                    c[j]++;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && (r[i] > 1 || c[j] > 1)) {
                    res++;
                }
            }
        }
        return res;
    }
}