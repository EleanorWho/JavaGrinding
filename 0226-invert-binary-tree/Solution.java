class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    // Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = solution.new TreeNode(4, 
            solution.new TreeNode(2, solution.new TreeNode(1), solution.new TreeNode(3)), 
            solution.new TreeNode(7, solution.new TreeNode(6), solution.new TreeNode(9)));
        TreeNode result = solution.invertTree(root);
        System.out.println(result.val);
    }
}