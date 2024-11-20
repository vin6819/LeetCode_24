class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int dp[][] = new int[text1.length() + 1][text2.length() + 1];
        for(int i[]: dp) {
            Arrays.fill(i, -1);
        }
        return helper(text1, text2, dp, text1.length(), text2.length());
    }
    static int helper(String s, String t, int dp[][], int x, int y) {
        if(x == 0 || y == 0) {
            return 0;
        }
        if(dp[x][y] != -1) {
            return dp[x][y];
        }
        if(s.charAt(0) == t.charAt(0)) {
            return dp[x][y] = 1 + helper(s.substring(1), t.substring(1), dp, x - 1, y - 1);
        }
        else {
            return dp[x][y] = Math.max(helper(s.substring(1), t, dp, x - 1, y), helper(s, t.substring(1), dp, x, y - 1));
        }
    }
}