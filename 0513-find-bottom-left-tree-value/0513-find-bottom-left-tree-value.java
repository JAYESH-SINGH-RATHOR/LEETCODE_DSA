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
    int maxdepth = -1;
    int ans = 0;
    public int findBottomLeftValue(TreeNode root) {
       if(root == null){
        return 0;
       }
        rec(root , 0);
        return ans;
    }
    void rec(TreeNode root , int max){
        if(root == null){
            return;
        }
        if(max > maxdepth){
            maxdepth = max;
            ans = root.val;
        }
        rec(root.left , max + 1);       
        rec(root.right , max + 1);       
    }
}