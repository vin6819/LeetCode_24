class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        Integer dp[] = new Integer[nums.length + 1];
        int x = helper(nums, 0, dp, nums.length - 2);
        dp = new Integer[nums.length + 1];
        int y = helper(nums, 1, dp, nums.length - 1);
        return Math.max(x, y);
    }
    static int helper(int a[], int i, Integer dp[], int n) {
        if(i > n) {
            return 0;
        }
        if(dp[i] != null) {
            return dp[i];
        }
        return dp[i] = Math.max(a[i] + helper(a, i + 2, dp, n), helper(a, i + 1, dp, n));
    }
}