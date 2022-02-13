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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean f = false;
        while(q.size()!=0){
            List<Integer> l = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode t = q.poll();
                if(t.left!=null)q.add(t.left);
                if(t.right!=null)q.add(t.right);
                
                if(!f)l.add(t.val);
                else l.add(0,t.val);
            }
            f=!f;
            ans.add(l);
        }
        return ans;
    }
}