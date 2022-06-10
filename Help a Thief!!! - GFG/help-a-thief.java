// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int T = Integer.parseInt(S[0]);
            int N = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            String S2[] = read.readLine().split(" ");
            
            int[] A = new int[N];
            int[] B = new int[N];
            
            for(int i=0; i<N; i++)
            {
                A[i] = Integer.parseInt(S1[i]);
                B[i] = Integer.parseInt(S2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.maxCoins(A,B,T,N));
        }
    }
}// } Driver Code Ends


class Solution {
    static int maxCoins(int[] a, int[] b, int t, int n) {
        // code here
        PriorityQueue<int[]>pq = new PriorityQueue<>((p,q)->q[1]-p[1]);
        
        for(int i=0;i<n;i++){
            pq.add(new int[]{a[i],b[i]});
        }
        int ans = 0;
        
        while(t>0&&!pq.isEmpty()){
            int x[] = pq.poll();
            for(int i=0;i<x[0] && t-->0;i++){
                ans+=x[1];
            }
        }
        return ans;
    }
}