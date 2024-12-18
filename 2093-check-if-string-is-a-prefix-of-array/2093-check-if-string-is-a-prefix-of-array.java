class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String t = "";
        for(String i: words) {
            t += i;
            if(s.equals(t)) {
                return true;
            }
        }
        return false;
    }
}