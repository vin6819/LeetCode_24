class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int prefix[] = new int[items.length];
        prefix[0] = items[0][1];
        for(int i = 1; i < items.length; i++) {
            prefix[i] = Math.max(prefix[i - 1], items[i][1]);
        }
        int res[] = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int l = 0, h = items.length - 1, m = l + (h - l) / 2;
            int pos = -1;
            while(l <= h) {
                m = l + (h - l) / 2;
                if(items[m][0] > queries[i]) {
                    h = m - 1;
                }
                else {
                    l = m + 1;
                    pos = m;
                }
            }
            if(pos != -1) {
                res[i] = prefix[pos];
            }
        }
        return res;
    }
}