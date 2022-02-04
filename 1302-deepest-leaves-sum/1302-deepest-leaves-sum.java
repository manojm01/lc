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
    public int deepestLeavesSum(TreeNode root) {
        ArrayList<Integer> l =new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        l.add(root.val);
        int h = height(root);
        while(!q.isEmpty()){
            int s = q.size();
            if(h==1)break;
            
            for(int i=1;i<=s;i++){
                TreeNode t = q.poll();
                l.remove(0);
                if(t.left!=null){
                    q.add(t.left);
                    l.add(t.left.val);
                }
                if(t.right!=null){
                    q.add(t.right);
                    l.add(t.right.val);
                }
            }
             h--;
        }
        
        int n=l.size();
        int sum=0;
        
       for(int i:l){
           sum += i;
       }
        
        return sum;
    }
    public int height(TreeNode root){
        if(root==null)return 0;
        
        return 1+Math.max(height(root.left),height(root.right));
    }
}