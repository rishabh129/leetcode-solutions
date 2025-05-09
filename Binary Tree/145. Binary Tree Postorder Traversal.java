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
    List<Integer> traverse(TreeNode root, List<Integer> tree){
        if(root == null){
            return tree;
        }

        traverse(root.left, tree);
        traverse(root.right, tree);
        tree.add(root.val);
        return tree;
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();

        return traverse(root, tree);
    }
}