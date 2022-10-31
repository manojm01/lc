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
    
    public List<Integer> distanceK(TreeNode root, TreeNode t, int k) {
        Map<TreeNode,TreeNode> p = new HashMap<TreeNode,TreeNode>();
        parent(root,p);
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> vis = new HashSet();
        vis.add(t);
        q.add(t);
        int cnt=0;
        
         while(!q.isEmpty()){
             int size = q.size();
             if(cnt==k)break;
             cnt++;
             for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                if(temp.left!=null && !vis.contains(temp.left)){
                    vis.add(temp.left);
                    q.add(temp.left);
                }
                if(temp.right!=null && !vis.contains(temp.right)){
                    vis.add(temp.right);
                    q.add(temp.right);
                }
                if(p.get(temp)!=null && !vis.contains(p.get(temp))){
                    vis.add(p.get(temp));
                    q.add(p.get(temp));
                }
             } 
        }
        List<Integer> ans = new ArrayList<Integer>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        return ans;
    }
    public void parent(TreeNode root,Map<TreeNode,TreeNode> p){
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        p.put(root,null);
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t.left!=null){
                p.put(t.left,t);
                q.add(t.left);
            }
            if(t.right!=null){
                p.put(t.right,t);
                q.add(t.right);
            }
        }
    }
}