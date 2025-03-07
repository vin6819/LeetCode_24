class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int res = 0;
        for(int i: left) {
            res = Math.max(res, i);
        }
        for(int i: right) {
            res = Math.max(res, n - i);
        }
        return res;
    }
}