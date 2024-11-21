class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int gc = guards.length, wc = walls.length;
        int res = m * n;
        res -= gc + wc;
        int grid[][] = new int[m][n];
        for(int i[]: walls) {
            grid[i[0]][i[1]] = 2;
        }
        for(int i[]: guards) {
            grid[i[0]][i[1]] = 3;
        }
        System.out.println(res);
        for(int i[]: guards) {
            int x = i[0] + 1, y = i[1];
            while(x < m && grid[x][y] != 2 && grid[x][y] != 3) {
                if(grid[x][y] != 1) {
                    res--;
                    grid[x][y] = 1;
                }
                x++;
            }
            x = i[0]; y = i[1] + 1;
            while(y < n && grid[x][y] != 2 && grid[x][y] != 3) {
                if(grid[x][y] != 1) {
                    res--;
                    grid[x][y] = 1;
                }
                y++;
            }
            x = i[0] - 1; y = i[1];
            while(x >= 0 && grid[x][y] != 2 && grid[x][y] != 3) {
                if(grid[x][y] != 1) {
                    res--;
                    grid[x][y] = 1;
                }
                x--;
            }
            x = i[0]; y = i[1] - 1;
            while(y >= 0 && grid[x][y] != 2 && grid[x][y] != 3) {
                if(grid[x][y] != 1) {
                    res--;
                    grid[x][y] = 1;
                }
                y--;
            }
        }
        return res;
    }
}