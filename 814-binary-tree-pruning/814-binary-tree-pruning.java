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
    
    public TreeNode pruneTree(TreeNode root) {
        if(check1(root)){
            return root;
        }
        return null;
        
    }
    public boolean check1(TreeNode root){
        if(root==null)return false;
        
        boolean checkLeft = check1(root.left);
        boolean checkRight = check1(root.right);
        
        if(!checkLeft)root.left=null;
        if(!checkRight)root.right=null;
        
        return root.val==1 ||checkLeft||checkRight;
    }
}