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
    int s=0;
    public TreeNode bstToGst(TreeNode root) {
        s = sum(root);
        inorder(root);
        // System.out.println(s);
        return root;
    }
    public int sum(TreeNode root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    int t = 0;
    public void inorder(TreeNode root){
        if(root==null)return;
        
        inorder(root.left);
        int pre = root.val;
        root.val = s-t;
        t = pre;
        s = root.val;
        inorder(root.right);
        
    }
}