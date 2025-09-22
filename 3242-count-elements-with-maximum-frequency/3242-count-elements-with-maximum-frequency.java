class Solution {
    public int maxFrequencyElements(int[] nums) {
        int f[] = new int[101];
        int max = 0;
        for (int i: nums) {
            f[i]++;
            max = Math.max(f[i], max);
        }
        int res = 0;
        for (int i: f) {
            if (max == i) {
                res += max;
            }
        }
        return res;
    }
}