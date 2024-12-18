class Solution {
    public int minLength(String s) {
        while(s.contains("AB") || s.contains("CD")) {
            int i = s.indexOf("AB");
            if(i != -1) {
                s = s.substring(0, i) + s.substring(i + 2);
            }
            i = s.indexOf("CD");
            if(i != -1) {
                s = s.substring(0, i) + s.substring(i + 2);
            }
        }
        return s.length();
    }
}