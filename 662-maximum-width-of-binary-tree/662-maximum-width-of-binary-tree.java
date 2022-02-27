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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        root.val=1;
        int ans=0;
        while(!q.isEmpty()){
            int s = q.size();
            int r=0,l=0;
            for(int i=0;i<s;i++){
                TreeNode t = q.poll();
                if(i==0)l=t.val;
                if(i==s-1)r=t.val;
                
                if(t.left!=null){
                    t.left.val = t.val*2;
                    q.add(t.left);
                }
                if(t.right!=null){
                    t.right.val = t.val*2+1;
                    q.add(t.right);
                }
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}