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
    long secondMin = Long.MAX_VALUE;
    int min;
    public int findSecondMinimumValue(TreeNode root) {
        min = root.val;
        height(root);

        return secondMin == Long.MAX_VALUE ? -1 : (int) secondMin;
    }

    void height (TreeNode node) {
        if (node == null) return;

        if (node.val > min && node.val < secondMin) {
            secondMin = node.val;
        }

        height(node.left);
        height(node.right);
    }
}