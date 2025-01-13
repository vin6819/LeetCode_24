class Solution {
    public int minimumLength(String s) {
        int f[] = new int[123];
        for(int i: s.toCharArray()) {
            f[i]++;
        }
        int res = 0;
        for(int i: f) {
            if(i > 0) {
                res += (i % 2 == 0) ? 2 : 1;
            }
        }
        return res;
    }
}