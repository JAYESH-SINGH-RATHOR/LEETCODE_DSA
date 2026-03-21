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
    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
            sum(root);
            return max;
    }
    int sum(TreeNode root){
        int sum = 0;
        if(root == null){
            return 0;
        }
        int lh = Math.max(0 , sum(root.left));
        int rh = Math.max(0 , sum(root.right));        
        sum += lh + rh + root.val;
        max = Math.max(max , sum);
        return Math.max(lh , rh) + root.val;
    }
}