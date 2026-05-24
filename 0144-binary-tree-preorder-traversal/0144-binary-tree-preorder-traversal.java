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
    // public void preOrder(TreeNode node,List<Integer> arr){
    //     if(node==null){
    //         return;
    //     }
    //     arr.add(node.val);
    //     preOrder(node.left,arr);
    //     preOrder(node.right,arr);
        
    // }
    
    public List<Integer> preorderTraversal(TreeNode root) {
        // List<Integer> arr=new ArrayList<>();
        // preOrder(root,arr);
        // return arr;
        List<Integer> result=new ArrayList<>();
        if(root==null)return result;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr=st.pop();
            int data=curr.val;
            result.add(data);
            if(curr.right!=null)st.push(curr.right);
            if(curr.left!=null)st.push(curr.left);

        }
        return result;


        
    }
}