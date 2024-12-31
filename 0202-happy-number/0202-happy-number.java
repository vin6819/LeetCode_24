class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && n != 7) {
            if(set.contains(n)) {
                return false;
            }
            set.add(n);
            int t = n;
            n = 0;
            while(t > 0) {
                n += (t % 10) * (t % 10);
                t /= 10;
            }
        }
        return true;
    }
}