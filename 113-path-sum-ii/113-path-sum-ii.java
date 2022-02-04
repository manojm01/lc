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
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>temp = new ArrayList<>();
        solve(root,t,ans,temp);
        return ans;
    }
    public void solve(TreeNode root, int t, List<List<Integer>> ans, List<Integer>temp){
        if(root==null)return;
         temp.add(root.val);
        
        if(root.left==null && root.right==null){
            if(t==root.val)
              ans.add(new ArrayList<Integer>(temp));
            return;
        }
        if(root.left!=null){
            solve(root.left,t-root.val,ans,temp);
            temp.remove(temp.size()-1);
        }
        if(root.right!=null){
            solve(root.right,t-root.val,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}