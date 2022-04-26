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
    int n = 0;
    HashMap<Integer,Integer> h = new HashMap<>();
    public int[] findMode(TreeNode root) {
        inorder(root);
        int max=0;
        for(int i:h.values()){
            max = Math.max(i,max);
        }
        System.out.println(h);
        ArrayList<Integer> l = new ArrayList<>();
        for(Map.Entry<Integer,Integer> itr:h.entrySet()){
            if(itr.getValue()==max){
                l.add(itr.getKey());
            }
        }
        int ans[] = new int[l.size()];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
    public void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        h.put(root.val,h.getOrDefault(root.val,0)+1);
        inorder(root.right);
    }
}