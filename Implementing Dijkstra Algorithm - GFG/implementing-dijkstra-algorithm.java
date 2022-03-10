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
            
            int S = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            
            int[] ptr = ob.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the shortest distance of all the vertices
    //from the source vertex S.
    static int[] dijkstra(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj, int src)
    {
        // Write your code here
        int dist[] = new int[v];
        boolean vis[] = new boolean[v];
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->(a.wt-b.wt));
        pq.add(new Pair(src,0));
        while(pq.size()!=0){
            Pair node = pq.poll();
            int u = node.v;
            if(vis[u])continue;
            vis[u]=true;
            dist[u] = node.wt;
            
            for(ArrayList<Integer> al:adj.get(u)){
                int alv = al.get(0);
                int alwt = al.get(1);
                
                if(!vis[alv]){
                    pq.add(new Pair(alv,alwt+dist[u]));
                    dist[alv] = alwt+dist[u];
                }
            }
        }
        return dist;
    }
}
class Pair{
    int v;
    int wt;
    
    Pair(int _v,int _wt){
        v=_v;
        wt=_wt;
    }
}

// int dist[] = new int[v];
        // PriorityQueue<Node> pq = new PriorityQueue<Node>(v,new Node());
        // pq.add(new Node(src,0));
        
        // while(pq.size()>0){
        //     Node node = pq.poll();
        //     for(Node it:adj.get(node.getV())){
        //         if(dist[node.getV()]+it.getWt() < dist[it.getV()]){
        //             dist[it.getV()] = dist[node.getV()]+it.getWt();
        //             pq.add(new Node(it.getV(),dist[it.getV()]));
        //         }
        //     }
        // }
        // return dist;


// class Node implements Comparator<Node>{
//     private int v;
//     private int weight;
//     Node(int _v,int _w){
//         v = _v;
//         weight = _w;
//     }
//     Node(){}
//     int getV(){return v;}
//     int getWt(){return weight;}
//     @Override
//     public int compare(Node node1,Node node2){
//         if(node1.weight<node2.weight)return -1;
//         if(node1.weight>node2.weight)return 1;
//         return 0;
//     }
// }

