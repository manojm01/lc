/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if(root==null)return ans;
        q.add(root);
        
        while(q.size()!=0){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            while(size-->0){
                Node t = q.remove();
                temp.add(t.val);
                for(Node x:t.children){
                    q.add(x);
                }
            }
            ans.add(temp);
        }
        
        return ans;
    }
}





