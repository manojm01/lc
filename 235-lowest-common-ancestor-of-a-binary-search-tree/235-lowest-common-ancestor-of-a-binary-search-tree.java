/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    ArrayList<TreeNode> pl = new ArrayList<>();
    ArrayList<TreeNode> ql = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        
        findPath(root,p,pl);
        findPath(root,q,ql);
        // System.out.println(pl);
        // System.out.println(ql);
        int i=0,j=0;
        TreeNode ans = new TreeNode(-1);
        while(i<pl.size()&&j<ql.size()){
            if(pl.get(i)==ql.get(j)){
                ans = pl.get(i);
            }else{
                break;
            }
            i++;j++;
        }
        return ans;
    }
    public void findPath(TreeNode root,TreeNode x,ArrayList<TreeNode> a){
        if(root==null)return;
        
        if(root.val == x.val){
            a.add(x);
            return;
        }
        else if(root.val > x.val){
             a.add(root);
             findPath(root.left,x,a);
        }
        else{
            a.add(root);
            findPath(root.right,x,a);
        }
    }
}