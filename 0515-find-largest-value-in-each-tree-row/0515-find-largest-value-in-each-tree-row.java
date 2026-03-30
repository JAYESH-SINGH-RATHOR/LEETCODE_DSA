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
    public List<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null){
            return res;
        }
         rec(root , res , 0);   
         return res;
    }

    void rec(TreeNode root , ArrayList<Integer>res , int max){
        if(root == null){
            return;
        }
        if(max == res.size()){
            res.add(root.val);
        }else{
            res.set(max , Math.max(res.get(max) , root.val));
        }

        rec(root.left , res , max + 1);
        rec(root.right , res , max + 1);
    }      
}