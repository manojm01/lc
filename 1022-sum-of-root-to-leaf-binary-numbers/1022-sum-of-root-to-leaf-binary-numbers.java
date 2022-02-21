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
    int ans = 0;
    public int sumRootToLeaf(TreeNode root) {
        if(root==null)return 0;
        
        solve(root,"");
        return ans;
    }
    public void solve(TreeNode root,String s){
        
        if(root.left==null && root.right==null){
            s += String.valueOf(root.val);
            ans += Integer.parseInt(s,2);
        }
        s += String.valueOf(root.val);
        if(root.left!=null){
            solve(root.left,s);
        }
        if(root.right!=null){
             solve(root.right,s);
        }
        
    }
}