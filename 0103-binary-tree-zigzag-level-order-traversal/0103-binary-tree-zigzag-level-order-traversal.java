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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
         if (root == null) return res;
        Queue<TreeNode> q = new LinkedList<>();
        boolean leftToRight = true;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> currlevel = new LinkedList<>();
            for(int i = 0; i < n; i++){
                TreeNode curr = q.remove();
                if(leftToRight){
                    currlevel.addLast(curr.val);
                }else{
                    currlevel.addFirst(curr.val);
                }
                 if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
            leftToRight = !leftToRight;
            res.add(currlevel);
        }
        return res;
    }
}