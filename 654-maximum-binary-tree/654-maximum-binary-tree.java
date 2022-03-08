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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return solve(nums,0,nums.length);
    }
    public TreeNode solve(int[] nums,int s,int e){
        if(e==s)return null;
        
        int maxI = max(nums,s,e);
        TreeNode ans = new TreeNode(nums[maxI]);
        ans.left = solve(nums,s,maxI);
        ans.right = solve(nums,maxI+1,e);
        return ans;
    }
    public int max(int a[],int s,int e){
        int ans = s;
        int ele = a[s];
        for(int i=s;i<e;i++){
            if(a[i]>ele){
                ele = a[i];
                ans = i;
            }
        }
        return ans;
    }
}