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
    TreeNode ans;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode t)     {
        inorder(original,cloned,t);
        return ans;
    }
    public void inorder(TreeNode o,TreeNode c,TreeNode t){
        if(o==null)return;
        inorder(o.left,c.left,t);
        if(o==t)ans=c;
        inorder(o.right,c.right,t);
    }
}