class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int f[] = new int[grid.length * grid.length + 1];
        for (int i[]: grid) {
            for (int j: i) {
                f[j]++;
            }
        }
        int res[] = new int[2];
        for (int i = 1; i < f.length; i++) {
            if (f[i] == 2) {
                res[0] = i;
            }
            if (f[i] == 0) {
                res[1] = i;
            }
        }
        return res;
    }
}