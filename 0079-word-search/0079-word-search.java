class Solution {
    private static boolean helper(char grid[][], int i, int j, String word, int ind) {
        if(ind == word.length()) {
            return true;
        }
        if(i == grid.length || j == grid[0].length || i == -1 || j == -1 || grid[i][j] != word.charAt(ind)) {
            return false;
        }
        grid[i][j] = '.';
        int r[] = {0, 0, -1, 1};
        int c[] = {1, -1, 0, 0};
        for(int k = 0; k < c.length; k++){
            boolean ans = helper(grid, i + r[k], j + c[k], word, ind + 1);
            if(ans) {
                return true;
            }
        }
        grid[i][j] = word.charAt(ind);
        return false;
    }
    public boolean exist(char[][] board, String word) {
        char ch = word.charAt(0);
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(ch == board[i][j]) {
                    boolean ans = helper(board, i, j, word, 0);
                    if(ans) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}