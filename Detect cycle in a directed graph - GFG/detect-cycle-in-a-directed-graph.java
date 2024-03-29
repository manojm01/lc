// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V + 1; i++)
                list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(V, list) == true)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}// } Driver Code Ends


/*Complete the function below*/

class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
        // code here
        int vis[] = new int[v];
        int dfsVis[] = new int[v];
        
        for(int i=0;i<v;i++){
            if(vis[i]==0){
                if(checkCycle(i,adj,vis,dfsVis)){
                    return true;
                }
            }
        }
        
        return false;
    }
    public boolean checkCycle(int node,ArrayList<ArrayList<Integer>> adj, int vis[],int dfsVis[]){
        vis[node]=1;
        dfsVis[node]=1;
        
        for(int i:adj.get(node)){
            if(vis[i]==0){
                if(checkCycle(i,adj,vis,dfsVis)){
                    return true;
                }
            }
            else if(dfsVis[i]==1){
                return true;
            }
        }
        dfsVis[node]=0;
        return false;
        
    }
}