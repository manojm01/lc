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
    public TreeNode sortedArrayToBST(int[] a) {
        
        return solve(a,0,a.length-1);
        
    }
    public TreeNode solve(int[] a,int i,int j){
        if(i>j){
            return null;
        }
        
        int m = (i+j)/2;
        
        TreeNode root = new TreeNode(a[m]);
        
        root.left = solve(a,i,m-1);
        root.right = solve(a,m+1,j);
        
        return root;
    }
}