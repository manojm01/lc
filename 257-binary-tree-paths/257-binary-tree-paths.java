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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<String>();
        preorder(root,"",ans);
        return ans;
    }
    public void preorder(TreeNode root,String s,List<String> ans){
        if(root==null)return;
        if(root.left==null && root.right==null){
            ans.add(s+root.val);
            return;
        }
        s += root.val + "->";
        
        preorder(root.left,s,ans);
        preorder(root.right,s,ans);
    }
}