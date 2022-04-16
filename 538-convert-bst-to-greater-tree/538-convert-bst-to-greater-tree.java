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
    int s = 0;
    public TreeNode convertBST(TreeNode root) {
        if(root==null)return null;
        s = sum(root);
        inorder(root);
        return root;
    }
    public int sum(TreeNode root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    }
    public void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        int x = root.val;
        root.val = s;
        s-=x;
        inorder(root.right);
    }
    
}