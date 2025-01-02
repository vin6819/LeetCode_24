class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int a[] = new int[words.length + 1];
        Set<Character> v = new HashSet<>();
        v.add('a');
        v.add('e');
        v.add('i');
        v.add('o');
        v.add('u');
        for(int i = 0; i < a.length - 1; i++) {
            String w = words[i];
            a[i + 1] = a[i];
            if(v.contains(w.charAt(0)) && v.contains(w.charAt(w.length() - 1))) {
                a[i + 1] += 1;
            }
        }
        int res[] = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            res[i] = a[queries[i][1] + 1] - a[queries[i][0]];
        }
        return res;
    }
}