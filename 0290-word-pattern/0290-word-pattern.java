class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> set = new HashSet<>();
        String a[] = s.split(" ");
        if(a.length != pattern.length()) {
            return false;
        }
        for(int i = 0; i < a.length; i++) {
            char c = pattern.charAt(i);
            if(map.containsKey(c) && !(map.get(c)).equals(a[i])) {
                return false;
            }
            if(!map.containsKey(c) && set.contains(a[i])) {
                return false;
            }
            set.add(a[i]);
            map.put(c, a[i]);
        }
        return true;
    }
}