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

    public int maxDepth(TreeNode root) {
        //LEVEL ORDER SPCACE:O(N)
        // if(root==null)return 0;
        // Queue<TreeNode> q=new LinkedList<>();
        // q.add(root);
        // int depth=0;
        // while(!q.isEmpty()){
        //     int level=q.size();
        //     depth++;
        //     for(int i=0;i<level;i++){
        //         TreeNode curr=q.poll();
        //         if(curr.left!=null)q.add(curr.left);
        //         if(curr.right!=null)q.add(curr.right);

        //     }

            
        // }
        // return depth;
        if(root==null)return 0;
        int leftsubtr=maxDepth(root.left);
        int rightsubtr=maxDepth(root.right);
        return 1+Math.max(leftsubtr,rightsubtr);
        
    }
}