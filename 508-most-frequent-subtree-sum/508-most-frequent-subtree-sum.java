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
    public int[] findFrequentTreeSum(TreeNode root) {
        
        TreeMap<Integer,Integer> map = new TreeMap<>();
        
        traverse(root,map);
        
        ArrayList<Integer> l = new ArrayList<>();
        int max = Collections.max(map.values());
        
         for(Map.Entry<Integer, Integer> itr :map.entrySet()){
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
    public void traverse(TreeNode root,TreeMap<Integer,Integer> map){
        if(root==null)return;
        int x = sum(root);
        map.put(x,map.getOrDefault(x,0)+1);
        
        traverse(root.left,map);
        traverse(root.right,map);
    }
    public int sum(TreeNode root){
        if(root==null)return 0;
        return root.val+sum(root.left)+sum(root.right);
    } 
}