class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int f[] = new int[n + 1];
        int res[] = new int[n];
        for(int i = 0; i < n; i++) {
            f[A[i]]++;
            f[B[i]]++;
            int c = 0;
            for(int j = 0; j <= n; j++) {
                if(f[j] == 2) {
                    c++;
                }
            }
            res[i] = c;
        }
        return res;
    }
}