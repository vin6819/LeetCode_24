class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) {
            return false;
        }
        int f[] = new int[123];
    	for(char i: s.toCharArray()) {
            f[i]++;
        }
        int oc = 0;
        for(int i: f) {
            if(i % 2 == 1) {
                oc++;
            }
        }
        return oc <= k;
    }
}