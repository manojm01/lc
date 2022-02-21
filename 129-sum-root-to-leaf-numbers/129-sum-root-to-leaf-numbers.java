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
    public int sumNumbers(TreeNode root) {
        if(root==null)return 0;
        solve(root,0);
        return ans;
    }
    public void solve(TreeNode root,int a){
        if(root.left==null && root.right==null){
            a = a*10 + root.val;
            ans += a;
        }
        a = a*10 + root.val;
        if(root.left!=null){
            solve(root.left,a);
        }if(root.right!=null){
            solve(root.right,a);
        }
    }
}