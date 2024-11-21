class Solution {
    public int rob(int[] nums) {
        Integer dp[] = new Integer[nums.length + 1];
        return helper(nums, 0, dp);
    }
    static int helper(int a[], int i, Integer dp[]) {
        if(i >= a.length) {
            return 0;
        }
        if(dp[i] != null) {
            return dp[i];
        }
        return dp[i] = Math.max(a[i] + helper(a, i + 2, dp), helper(a, i + 1, dp));
    }
}