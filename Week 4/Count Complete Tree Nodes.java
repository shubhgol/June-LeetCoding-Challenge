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
    public static int leftHeight(TreeNode root) {
        if(root==null)
            return 0;
        return 1+leftHeight(root.left);
    }
    public static int rightHeight(TreeNode root) {
        if(root==null)
            return 0;
        return 1+rightHeight(root.right);
    }
    public int countNodes(TreeNode root) {
        int lh, rh=0;
        lh = leftHeight(root);
        rh = rightHeight(root);
        
        if(lh==rh)
            return (int)Math.pow(2, lh)-1;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}