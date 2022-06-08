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
            String str = br.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.CountWays(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int CountWays(String s)
    {
        // code here
        int mod = (int)1e9+7;
        int n = s.length();
        char c[] = s.toCharArray();
        
        for(int i=0;i<n-1;i++){
            if(c[i]==0&&c[i+1]==0)return 0;
        }
        int dp[] = new int[n+1];
        dp[0]=1;
        
        for(int i=0;i<n;i++){
            if(c[i]=='0')continue;
            
            dp[i+1] = (dp[i]+dp[i+1])%mod;
            
            if(i!=n-1 && (c[i]=='1' || (c[i]=='2' && c[i+1]<'7'))){
                dp[i+2] = (dp[i]+dp[i+2])%mod;
            }
        }
        
        return dp[n];
    }
}