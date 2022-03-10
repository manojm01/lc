class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> ans = new ArrayList<>();
        List<List<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(i).add(graph[i][j]);
            }
        }
        List<Integer> path = new ArrayList<>();
        path.add(0);
        
        dfs(adj,0,path,ans);
        return ans;
    }
    public void dfs(List<List<Integer>> adj,int node,List<Integer> path,List<List<Integer>> ans){
        
        if(node==adj.size()-1){
            ans.add(new ArrayList<Integer>(path));
            return;
        }
        for(int nextNode:adj.get(node)){
            path.add(nextNode);
            dfs(adj,nextNode,path,ans);
            path.remove(path.size()-1);
        }
    }
}