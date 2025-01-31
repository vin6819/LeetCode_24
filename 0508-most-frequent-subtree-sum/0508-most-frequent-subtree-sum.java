/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int helper(TreeNode root, Map<Integer, Integer> map, int max[]) {
        if (root == null) {
            return 0;
        }
        int l = helper(root.left, map, max);
        int r = helper(root.right, map, max);
        int sum = l + r + root.val;
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        max[0] = Math.max(max[0], map.get(sum));
        return sum;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        Map<Integer, Integer> map = new HashMap<>();
        int max[] = new int[]{Integer.MIN_VALUE};
        helper(root, map, max);
        List<Integer> list = new ArrayList<>();
        for (int k: map.keySet()) {
            if (map.get(k) == max[0]) {
                list.add(k);
            }
        }
        System.out.println(list);
        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}