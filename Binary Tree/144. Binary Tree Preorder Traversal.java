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

// Solution 1 - Recursive approach
class Solution {
    List<Integer> traverse(TreeNode root, List<Integer> tree){
        if(root == null){
            return tree;
        }
        tree.add(root.val);

        traverse(root.left, tree);
        traverse(root.right, tree);
        return tree;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();

        return traverse(root, tree);
    }
}

// Solution 2 - Iterative approach

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        if(root==null){
            return tree;
        }

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode curr=stack.pop();
            tree.add(curr.val);
            if(curr.right!=null){
                stack.push(curr.right);
            }
            if(curr.left!=null){
                stack.push(curr.left);
            }
        }
        return tree;
    }
}