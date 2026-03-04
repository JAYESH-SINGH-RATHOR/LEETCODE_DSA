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


public class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    boolean validate(TreeNode root , TreeNode max , TreeNode min){
        if(root == null){
            return true;
        }
        if(min != null && root.val <= min.val){
            return false;
        }
        else if(max != null && root.val >= max.val){
            return false;
        }
        return validate(root.left , root , min) && validate(root.right , max , root);
    }
}
