class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, int[]> map = new HashMap<>();
        int row[] = new int[m];
        int col[] = new int[n];
        Arrays.fill(row, n);
        Arrays.fill(col, m);
        for(int r = 0; r < m; r++) {
            for(int c = 0; c < n; c++) {
                map.put(mat[r][c], new int[]{r, c});
            }
        }
        for(int i = 0; i < arr.length; i++) {
            int a[] = map.get(arr[i]);
            if(--row[a[0]] == 0) {
                return i;
            }
            if(--col[a[1]] == 0) {
                return i;
            }
        }
        return -1;
    }
}