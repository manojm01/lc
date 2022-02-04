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
    public int pathSum(TreeNode root, int t) {
        if(root==null){
            return 0;
        }
        return solve(root,t) + pathSum(root.left,t) + pathSum(root.right,t);
    }
    public int solve(TreeNode root,int t){
        if(root==null){
            return 0;
        }
        int ans = 0;
        
        if(root.val==t)ans++;
        
        ans += solve(root.left,t-root.val);
        ans += solve(root.right,t-root.val);
        return ans;
    }
}