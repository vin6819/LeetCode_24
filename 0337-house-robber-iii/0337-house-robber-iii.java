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
    public int rob(TreeNode root) {
        Map<TreeNode, Integer> dp = new HashMap<>();
        return helper(root, dp);
    }
    static int helper(TreeNode root, Map<TreeNode, Integer> dp) {
        if(root == null) {
            return 0;
        }
        if(dp.containsKey(root)) {
            return dp.get(root);
        }
        int x = root.val;
        if(root.left != null) {
            x += helper(root.left.left, dp);
            x += helper(root.left.right, dp);
        }
        if(root.right != null) {
            x += helper(root.right.left, dp);
            x += helper(root.right.right, dp);
        }
        int y = helper(root.left, dp) + helper(root.right, dp);
        dp.put(root, Math.max(x, y));
        return dp.get(root);
    }
}