// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
            int[][] blocked_cells = new int[k][2];
            for(int i = 0; i < k; i++){
                String[] s1 = br.readLine().trim().split(" ");
                for(int j = 0; j < 2; j++){
                    blocked_cells[i][j] = Integer.parseInt(s1[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.FindWays(n, m, blocked_cells);
            System.out.println(ans);

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    int mod=1000000007;
    public int FindWays(int n, int m, int[][] b)
    {
        // Code here
  
        int adj[][]=new int[n][m];
        int dp[][]=new int[n][m];
        for(int i=0;i<b.length;i++){
            int a1=b[i][0],
                a2=b[i][1];
                adj[a1-1][a2-1]=1;
        }
        return getWays(dp,adj,n-1,m-1);
    
    }
    
    public int getWays(int [][]dp,int [][]adj,int i,int j){
        if(i<0||j<0) return 0;
        if(adj[i][j]==1) return 0;
        if(i==0&&j==0) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        dp[i][j]+=(getWays(dp,adj,i-1,j)%mod+getWays(dp,adj,i,j-1)%mod)%mod;
        return dp[i][j];
    }
}