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
    int maxD=0;
    public int diameterOfBinaryTree(TreeNode root) {
        heightTree(root);
        return maxD;

        
    }
    public int heightTree(TreeNode root){
        if(root==null)return 0;
        int lh=heightTree(root.left);
        int rh=heightTree(root.right);
        maxD=Math.max(maxD,lh+rh);
        return 1+Math.max(lh,rh);
    }
}