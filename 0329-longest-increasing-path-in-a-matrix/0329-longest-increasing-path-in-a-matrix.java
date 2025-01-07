class Solution {
    public int fun(int[][] matrix, int row, int col, int prevalue, Integer dp[][]) {
        if (row >= matrix.length || row < 0 || col >= matrix[0].length || col < 0 || matrix[row][col] == -1
                || matrix[row][col] <= prevalue) {
            return 0;
        }
        if (dp[row][col] != null) {
        return dp[row][col];
        }
        int curr = matrix[row][col];
        matrix[row][col] = -1;
        int tempMax = 1;
        tempMax += Math.max(Math.max(fun(matrix, row + 1, col, curr, dp), fun(matrix, row - 1, col, curr, dp)),
                Math.max(fun(matrix, row, col - 1, curr, dp), fun(matrix, row, col + 1, curr, dp)));
        matrix[row][col] = curr;
        return dp[row][col] = tempMax;
    }

    public int longestIncreasingPath(int[][] matrix) {
        int ans = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Integer dp[][] = new Integer[205][205];
                ans = Math.max(fun(matrix, i, j, Integer.MIN_VALUE, dp), ans);
            }
        }
        return ans;
    }
}