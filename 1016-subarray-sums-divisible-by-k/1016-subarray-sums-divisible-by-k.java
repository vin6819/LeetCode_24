class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;
        int freq[] = new int[k];
        freq[0] = 1;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int rem = (int)(sum % k);
            if (rem < 0) {
                rem += k;
            }
            freq[rem]++;
        }
        int ans = 0;
        for (int i = 0; i < k; i++) {
            if (freq[i] >= 2) {
                int x = freq[i];
                ans += (x * (x - 1)) / 2;
            }
        }
        return ans;
    }
}