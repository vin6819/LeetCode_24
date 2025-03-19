class Solution {
    private static void flip(int nums[], int i) {
        nums[i] = 1;
        nums[i + 1] = (nums[i + 1] == 0) ? 1 : 0;
        nums[i + 2] = (nums[i + 2] == 0) ? 1 : 0;
    }
    public int minOperations(int[] nums) {
        int ans = 0;
        int len = nums.length;
        for(int i = 0; i < len - 2; i++) {
            if(nums[i] == 0) {
                flip(nums, i);
                ans++;
            }
        }
        // System.out.print(Arrays.toString(nums));
        if((nums[len - 1] * nums[len - 2] * nums[len - 2]) == 1) {
            return ans;
        }
        return -1;
    }
}