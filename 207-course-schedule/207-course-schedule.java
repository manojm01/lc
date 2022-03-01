class Solution {
    public boolean canFinish(int n, int[][] p) {
        int x = p.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<x;i++){
            adj.get(p[i][0]).add(p[i][1]);
        }
        int vis[] = new int[n];
        int dfsVis[] = new int[n];
        
        
        for(int i=0;i<n;i++){
            // if(vis[i]==0){
                if(checkCycle(i,adj,vis,dfsVis)){
                    return false;
                }
            // }
        }
        return true;
    }
    public boolean checkCycle(int node, ArrayList<ArrayList<Integer>> adj, int vis[], int dfsVis[]){
        if(vis[node]==1)return true;
        vis[node]=1;
        // dfsVis[node]=1;
        
        for(int i:adj.get(node)){
            if(vis[i]!=2){
                if(checkCycle(i,adj,vis,dfsVis)){
                    return true;
                }
                // else if(dfsVis[i]==1){
                //     return true;
                // }
            }
        }
        vis[node]=2;
        return false;
    }
}