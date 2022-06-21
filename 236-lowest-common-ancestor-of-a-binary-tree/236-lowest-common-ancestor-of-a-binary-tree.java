/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)return null;
        if(search(root,p) && search(root,q)){
            ans = root;
        }
        lowestCommonAncestor(root.left,p,q);
        lowestCommonAncestor(root.right,p,q);
        
        return ans;
        
    }
    public boolean search(TreeNode root, TreeNode p){
        if(root==null)return false;
        if(root==p)return true;
        
        if(search(root.left,p) || search(root.right,p)){
            return true;
        }
        return false;
    }
}