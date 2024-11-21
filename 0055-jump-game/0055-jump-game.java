class Solution {
    public boolean canJump(int[] nums) {
        Boolean dp[] = new Boolean[100001];
        return helper(nums, 0, dp);
    }
    static boolean helper(int a[], int i, Boolean dp[]) {
        if(i >= a.length) {
            return false;
        }
        if(i == a.length - 1) {
            return true;
        }
        if(dp[i] != null) {
            return dp[i];
        }
        for(int j = 1; j <= a[i]; j++) {
            dp[i] = helper(a, i + j, dp);
            if(dp[i]) {
                return true;
            }
        }
        return false;
    }
}