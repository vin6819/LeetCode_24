class Solution {
    static void helper(int grid[][], int x, int y, boolean visited[][], int c, int res[]) {
        if(x < 0 || y < 0 || x >= grid.length || y >= grid[0].length || visited[x][y] || grid[x][y] == -1) {
            return;
        }
        if(grid[x][y] == 2 && c == -1) {
            res[0]++;
            return;
        }
        visited[x][y] = true;
        helper(grid, x + 1, y, visited, c - 1, res);
        helper(grid, x, y + 1, visited, c - 1, res);
        helper(grid, x - 1, y, visited, c - 1, res);
        helper(grid, x, y - 1, visited, c - 1, res);
        visited[x][y] = false;
    }
    public int uniquePathsIII(int[][] grid) {
        boolean visited[][] = new boolean[grid.length][grid[0].length];
        int res[] = {0};
        int x = 0, y = 0, c = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1) {
                    x = i;
                    y = j;
                }
                if(grid[i][j] == 0) {
                    c++;
                }
            }
        }
        helper(grid, x, y, visited, c, res);
        return res[0];
    }
}