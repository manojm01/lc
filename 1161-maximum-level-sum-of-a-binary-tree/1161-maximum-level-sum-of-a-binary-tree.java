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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> l = new ArrayList<>();
        
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            while(size-->0){
                TreeNode t = q.poll();
                sum += t.val;
                if(t.left!=null)q.add(t.left);
                if(t.right!=null)q.add(t.right);
            }
            l.add(sum);
        }
        int max = l.get(0);
        int ans =0;
        for(int i=1;i<l.size();i++){
           if(l.get(i)>max){
               max = l.get(i);
               ans = i;
           }
        }
        return ans+1;
    }
}