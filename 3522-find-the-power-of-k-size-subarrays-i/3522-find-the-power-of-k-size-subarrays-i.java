class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if(k == 1) {
            return nums;
        }
        int res[] = new int[nums.length - k + 1];
        for(int i = 0; i <= nums.length - k; i++) {
            res[i] = nums[i + k - 1];
            boolean b = false;
            for(int j = i + 1; j < i + k; j++) {
                if(nums[j] - nums[j - 1] != 1) {
                    b = true;
                    break;
                }
            }
            if(b) {
                res[i] = -1;
            }
        }
        return res;
    }
}