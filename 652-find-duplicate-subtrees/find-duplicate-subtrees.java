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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
      ArrayList<TreeNode> list = new ArrayList<>();
      HashMap<String , Integer> hm = new HashMap<>();
      duplicate(root , hm , list);
      return list;            
    }
    String duplicate(TreeNode root , HashMap<String , Integer> hm ,             ArrayList<TreeNode> list){
        if(root == null){
            return "?";
        }
        String left = duplicate(root.left , hm , list);
        String right = duplicate(root.right , hm , list);
        String pattern = root.val + "?" + left + "?" + right;
        int count = hm.getOrDefault(pattern , 0);
       if(count == 1){
        list.add(root);
       }
       hm.put(pattern , count +  1);
       return pattern;
    }
}