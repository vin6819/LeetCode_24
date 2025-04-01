class Solution {
    static long helper(int a[][], int i, long dp[]) {
        if (i >= a.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        dp[i] = Math.max(a[i][0] + helper(a, i + a[i][1] + 1, dp), helper(a, i + 1, dp));
        return dp[i];
    }
    public long mostPoints(int[][] questions) {
        long dp[] = new long[questions.length];
        Arrays.fill(dp, -1);
        long res = helper(questions, 0, dp);
        return res;
    }
}