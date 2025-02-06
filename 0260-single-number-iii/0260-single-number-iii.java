class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for (int i: nums) {
            ans ^= i;
        }
        int a = 0;
        int mask = ans & (~(ans - 1));
        for (int i: nums) {
            if ((i & mask) != 0) {
                a ^= i;
            }
        }
        int b = ans ^ a;
        return new int[]{a, b};
    }
}