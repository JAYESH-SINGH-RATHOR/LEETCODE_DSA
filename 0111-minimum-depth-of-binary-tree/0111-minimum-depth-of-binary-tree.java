// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     public int minDepth(TreeNode root) {
//         if(root == null){
//             return 0;
//         }
//         if(root.left == null){
//             return minDepth(root.right) + 1;
//         }
//         if(root.right == null){
//             return minDepth(root.left) + 1;
//         }
//         return Math.min(minDepth(root.left) , minDepth(root.right)) + 1;
//     }
// }

// secound method -> 2 using bfs 

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        Deque<TreeNode> q =  new ArrayDeque<>();
        int depth = 1;
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            for(int i = 0; i < n; i++){
                TreeNode curr = q.remove();
                if(curr.left == null && curr.right == null){
                    return depth;
                }
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right); 
                }
            }
            depth++;
        }        
        return depth;
    }
}