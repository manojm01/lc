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
   
    public int maxPathSum(TreeNode root) {
        if(root==null)return 0;
         int ans[] = new int[1];
        ans[0] = Integer.MIN_VALUE;
        fun(root,ans);
      //  solve(root,0);
        return ans[0];
    }
    public int fun(TreeNode node,int ans[]){
        if(node==null)return 0;
        int l = Math.max(0,fun(node.left,ans));
        int r = Math.max(0,fun(node.right,ans));
        
        ans[0] = Math.max(ans[0],node.val+l+r);
        
        return node.val + Math.max(l,r);
    }
    // public void inorder(TreeNode root,ArrayList<Integer> l){
    //     if(root==null)return;
    //     inorder(root.left,l);
    //     l.add(root.val);
    //     inorder(root.right,l);
    // }
//     public void solve(TreeNode root,int a){
//         if(root==null)return;
//         a += root.val;
//         if(root.left==null && root.right==null){
//             a += root.val;
//             ans = Math.max(ans,a);
//         }
//         if(root.left!=null && root.right!=null){
//             a += root.left.val+root.right.val;
//             ans = Math.max(ans,a);
//         }
//         if(root.left!=null){
//             solve(root.left,a);
//         }if(root.right!=null){
//             solve(root.right,a);
//         }
        
//     }
}