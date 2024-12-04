class Solution {
    public String addSpaces(String s, int[] spaces) {
        int i = 0, j = 0;
        StringBuilder res = new StringBuilder();
        while(i < s.length()) {
            if(j == spaces.length) {
                break;
            }
            if(spaces[j] == i) {
                res.append(" ");
                j++;
            }
            res.append(s.charAt(i));
            i++;
        }
        res.append(s.substring(i));
        return res.toString();
    }
}