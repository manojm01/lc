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
    int pi = 0;
    HashMap<Integer,Integer> m = new HashMap<>();
    public TreeNode buildTree(int[] p, int[] in) {
       
        
         pi = 0;
           for(int i=0;i<in.length;i++){
               m.put(in[i],i);
           }
        
        return fun(p,0,p.length-1);
        
    }
    public TreeNode fun(int []p,int l,int r){
        if(l>r)return null;
        int rootVal = p[pi++];
         TreeNode root = new TreeNode(rootVal);
        
        root.left = fun(p,l,m.get(root.val)-1);
        root.right = fun(p,m.get(root.val)+1,r);
        return root;
    }
}