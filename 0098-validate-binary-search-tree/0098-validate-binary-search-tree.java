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
        return isBst(root , null , null);
    }
    boolean isBst(TreeNode root , TreeNode max ,TreeNode min){
        if(root == null){
            return true;
        }else if(min != null && root.val <= min.val){
            return false;
        }else if(max != null && root.val >= max.val){
            return false;
        }
        return isBst(root.left , root , min) && isBst(root.right , max ,root);
    }
}
