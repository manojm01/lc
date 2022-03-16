// { Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class DriverClass
{
    public static void main(String args[]) throws IOException {

        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            Solution ob = new Solution();
            
            System.out.println(ob.spanningTree(V, adj));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution
{
    //Function to find sum of weights of edges of the Minimum Spanning Tree.
    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj) 
    {
        // Add your code here
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[v];
        pq.add(new Pair(0,-1,0));
        int ans = 0;
        while(pq.size()>0){
            Pair node = pq.remove();
            if(vis[node.v])continue;
            vis[node.v] = true;
            ans += node.wt;
            for(ArrayList<Integer> i:adj.get(node.v)){
                if(!vis[i.get(0)]){
                    pq.add(new Pair(i.get(0),node.v,i.get(1)));
                }
            }
        }
        return ans;
    }
}
class Pair implements Comparable<Pair>{
    int v;
    int parent;
    int wt;
    
    Pair(int  v,int parent,int wt){
        this.v = v;
        this.parent = parent;
        this.wt = wt;
    }
    public int compareTo(Pair p){
        return this.wt-p.wt;
    }
}
