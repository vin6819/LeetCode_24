class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i = 0, j = 0;
        while(i < str1.length() && j < str2.length()) {
            int a = str1.charAt(i) - 97, b = str2.charAt(j) - 97;
            if(a == b || (a + 1) % 26 == b) {
                j++;
            }
            i++;
        }
        return j == str2.length();
    }
}