class Solution {
    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        for (int i = 1; i < meetings.length; i++) {
            int x[] = meetings[i - 1], y[] = meetings[i];
            if (x[1] >= y[0]) {
                y[0] = x[0];
                y[1] = Math.max(y[1], x[1]);
                x[0] = -1;
                n--;
            }
        }
        int a[][] = new int[n][2];
        int ind = 0, max = 0, min = Integer.MAX_VALUE;
        for (int i[]: meetings) {
            if (i[0] != -1) {
                a[ind++] = new int[]{i[0], i[1]};
                max = Math.max(i[1], max);
                min = Math.min(i[0], min);
                // System.out.println(Arrays.toString(i));
            }
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            int val = a[i][0] - a[i - 1][1] - 1;
            res += (val > 0) ? val : 0;
        }
        return res + ((days - max > 0) ? days - max : 0) + min - 1;
    }
}