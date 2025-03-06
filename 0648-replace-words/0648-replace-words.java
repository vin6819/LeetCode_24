class Solution {
    public static class Trie {

        static class Node {
            char ch;
            Map<Character, Node> child = new HashMap<>();
            boolean isTerminal;
        }

        private static Node root;

        public Trie() {
            root = new Node();
            root.ch = '*';
        }

        public static void insert(String word) {
            Node curr = root;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (curr.child.containsKey(ch)) {
                    curr = curr.child.get(ch);
                } else {
                    Node nn = new Node();
                    nn.ch = ch;
                    curr.child.put(ch, nn);
                    curr = nn;
                }
            }
            curr.isTerminal = true;
        }

        public static String getString(String str) {
            Node curr = root;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (curr.child.containsKey(ch)) {
                    sb.append(ch);
                    curr = curr.child.get(ch);
                    if (curr.isTerminal) {
                        return sb.toString();
                    }
                }
                else {
                    return str;
                }
            }
            return str;
        }

    }
    public String replaceWords(List<String> dictionary, String sentence) {
        String arr[] = sentence.split(" ");
        Trie t = new Trie();
        for (String s: dictionary) {
            t.insert(s);
        }
        String ans = "";
        for (String s: arr) {
            ans += t.getString(s) + " ";
        }
        return ans.trim();
    }
}

