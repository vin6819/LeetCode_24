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
    Map<Long, Integer> map = new HashMap<>();
    int c = 0;
    public int pathSum(TreeNode root, int targetSum) {
        count(root, targetSum, 0);
        return c;
    }
    void count(TreeNode root, int t, long sum) {
        if (root == null) {
            return;
        }
        sum += root.val;
        if (sum == t) {
            c++;
        }
        c += map.getOrDefault(sum - t, 0);
        map.put(sum, map.getOrDefault(sum, 0) + 1);
        count(root.left, t, sum);
        count(root.right, t, sum);
        map.put(sum, map.get(sum) - 1);
    }
}