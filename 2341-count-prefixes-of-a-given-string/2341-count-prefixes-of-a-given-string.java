class Solution {
    public int countPrefixes(String[] words, String s) {
        int c = 0;
        for(String i: words) {
            if(s.startsWith(i)) {
                c++;
            }
        }
        return c;
    }
}