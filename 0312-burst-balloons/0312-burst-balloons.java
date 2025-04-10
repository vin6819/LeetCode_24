class Solution {
    public int maxCoins(int[] nums) {
        int a[] = new int[nums.length + 2];
        Integer dp[][] = new Integer[a.length][a.length];
        a[0] = a[a.length - 1] = 1;
        for (int i = 1; i < a.length - 1; i++) {
            a[i] = nums[i - 1];
        }
        return maximum_coins(a, 0, a.length - 1, dp);
    }
    static int maximum_coins(int a[], int i, int j, Integer dp[][]) {
        if (i + 1 == j) {
            return 0;
        }
        if (dp[i][j] != null) {
            return dp[i][j];
        }
        int ans = Integer.MIN_VALUE;
        for (int k = i + 1; k < j; k++) {
            int left = maximum_coins(a, i, k, dp);
            int right = maximum_coins(a, k, j, dp);
            int self = a[i] * a[k] * a[j];
            ans = Math.max(ans, left + right + self);
        }
        return dp[i][j] = ans;
    }
}