class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int min = Integer.MAX_VALUE, c = 0;
        long res =  0;
        for(int i[]: matrix) {
            for(int j: i) {
                if(j < 0) {
                    c++;
                }
                int x = Math.abs(j);
                min = Math.min(min, x);
                res += x;
            }
        }
        if(c % 2 == 0) {
            return res;
        }
        return res - (2 * min);
    }
}