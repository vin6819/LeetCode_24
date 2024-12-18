class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, c = 0;
        String res = "";
        while(i >= 0 && j >= 0) {
            int s = a.charAt(i) + b.charAt(j) - 96 + c;
            c = s / 2;
            s %= 2;
            res = s + res;
            i--;
            j--;
        }
        while(i >= 0) {
            int s = a.charAt(i) - 48 + c;
            c = s / 2;
            s %= 2;
            res = s + res;
            i--;
        }
        while(j >= 0) {
            int s = b.charAt(j) - 48 + c;
            c = s / 2;
            s %= 2;
            res = s + res;
            j--;
        }
        if(c == 1) {
            res = "1" + res;
        }
        return res;
    }
}