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
            int q = Integer.parseInt(br.readLine().trim());
            int[][] Query = new int[q][2];
            for(int i = 0; i < q; i++){
                String[] s = br.readLine().trim().split(" ");
                for(int j = 0; j < 2; j++){
                    Query[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.SolveQueris(str, Query);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] SolveQueris(String str, int[][] q)
    {
        // Code here
        char c[] = str.toCharArray();
        int a[] = new int[q.length];
        
        for(int i=0;i<q.length;i++){
            int s = q[i][0]-1;
            int e = q[i][1]-1;
            a[i] = check(str,s,e);
        }
        return a;
    }
    
    public int check(String str,int s,int e){
        int arr[] = new int[26];
         char c[] = str.toCharArray();
         for(int i=s;i<=e;i++){
             arr[c[i]-'a']++;
         }
         int ans = 0;
         
         for(int i:arr){
             if(i!=0)ans++;
         }
         return ans;
        
    }
}