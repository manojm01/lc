class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int x = edges.length;
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<x;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        int vis[] = new int[n];
        for(int i=0;i<n;i++){
             if(vis[i]==0)
                if(check(i,adj,s,d,vis)){
                    return true;
                }
            if(vis[s]==1&&vis[d]==1)return true;
            vis[s]=0;vis[d]=0;
        }
        return false;
    }
     public boolean check(int node, ArrayList<ArrayList<Integer>> adj, int s, int d, int[] vis){
         boolean ss = false;
         vis[node]=1;
         
         // if(vis[s]==1&&vis[d]==1)return true;
             
         for(int i:adj.get(node)){
             if(vis[i]==0)
              if(check(i,adj,s,d,vis))return true;
         }
         
         return false;
     }
        
}