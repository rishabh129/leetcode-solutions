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
// Solution 1 - Recursive Approach
class Solution {
    List<Integer> traverse(TreeNode root, List<Integer> tree){
        if(root == null){
            return tree;
        }

        traverse(root.left, tree);
        tree.add(root.val);
        traverse(root.right, tree);
        return tree;
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();

        return traverse(root, tree);
    }
}

// Solution 2 - Iterative Approach

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> tree = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while(true){
            if(root!=null){
                stack.push(root);
                root=root.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                root=stack.pop();
                tree.add(root.val);
                root=root.right;
            }
        }
        return tree;
    }
}