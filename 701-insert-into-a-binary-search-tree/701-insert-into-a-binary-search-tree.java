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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
//         if(root==null){
//             TreeNode x = new TreeNode(val);
//             root= x;
//             return root;
//         }
//         if(root.val>val){
//            root.left =  insertIntoBST(root.left,val);
//         }
//         else
//             root.right = insertIntoBST(root.right,val);
        
//         return root;
        TreeNode ans = new TreeNode(val);
        TreeNode t = root;
        TreeNode tt = root;
        if(root==null){
            return ans;
        }
        
        while(t!=null){
            tt=t;
            if(t.val>val){
                t=t.left;
            }else{
                t=t.right;
            }
        }
       
        if(tt.val>val){
            tt.left=ans;
        }else{
            tt.right=ans;
        }
        return root;
    }
}