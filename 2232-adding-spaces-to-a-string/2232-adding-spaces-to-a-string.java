class Solution {
    public String addSpaces(String s, int[] spaces) {
        int i = 0, j = 0;
        StringBuilder res = new StringBuilder();
        while(i < s.length()) {
            if(j < spaces.length && spaces[j] == i) {
                res.append(" ");
                j++;
            }
            res.append(s.charAt(i));
            i++;
        }
        return res.toString();
    }
}