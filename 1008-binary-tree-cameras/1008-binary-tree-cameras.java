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
    static int helper(TreeNode root, int c[]) {
        if (root == null) {
            return 0;
        }
        int left = helper(root.left, c);
        int right = helper(root.right, c);
        if (left == -1 || right == -1) {
            c[0]++;
            return 1;
        }
        else if (left == 1 || right == 1) {
            return 0;
        }
        else {
            return -1;
        }
    }
    public int minCameraCover(TreeNode root) {
        int c[] = {0};
        if (helper(root, c) == -1) {
            c[0]++;
        }
        return c[0];
    }
}