class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int res[] = new int[n];
        char ch[] = boxes.toCharArray();
        for(int i = 0; i < n; i++) {
            int c = 0, j = i - 1;
            while(j >= 0) {
                if(ch[j] == '1') {
                    c += i - j;
                }
                j--;
            }
            j = i + 1;
            while(j < n) {
                if(ch[j] == '1') {
                    c += j - i;
                }
                j++;
            }
            res[i] = c;
        }
        return res;
    }
}