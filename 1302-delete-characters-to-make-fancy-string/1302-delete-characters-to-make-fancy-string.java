class Solution {
    public String makeFancyString(String s) {
        if(s.length() < 3) {
            return s;
        }
        int j = 1;
        StringBuilder res = new StringBuilder(s.substring(0, 2));
        for(int i = 2; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(j) && s.charAt(i) == s.charAt(j - 1)) {
                continue;
            }
            else {
                j = i;
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}