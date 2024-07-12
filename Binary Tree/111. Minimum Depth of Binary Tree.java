// BFS - Level Order Traversal

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
    
    int height(TreeNode root){
        if(root==null)
        return 0;

        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        int level =1;
        while(!q.isEmpty()){
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr=q.remove();

                if(curr.left==null & curr.right==null){
                    return level;
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
           level++;
        }
        return level;
    }
    public int minDepth(TreeNode root) {
        return height(root);
    }
}