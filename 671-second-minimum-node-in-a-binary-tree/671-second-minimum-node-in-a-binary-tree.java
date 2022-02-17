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
    long min =  Long.MAX_VALUE;
    long smin = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        inorder(root);
        if(smin==min)smin=-1;
        int ans = (int)smin;
        return ans;
    }
    public void inorder(TreeNode root){
        if(root==null)return;
        
        inorder(root.left);
        if(root.val<min){
            smin=min;
            min=root.val;
        }else if(root.val<smin && root.val>min){
            smin = root.val;
        }
        inorder(root.right);
        
    }
}