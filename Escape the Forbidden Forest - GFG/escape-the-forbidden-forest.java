// { Driver Code Starts
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String str1 = sc.next();
            String str2 = sc.next();
            Sol obj = new Sol();
            System.out.println(obj.build_bridges(str1,str2));
        }
    }
}// } Driver Code Ends


class Sol
{
    public static int build_bridges(String str1 , String str2)
    {
       // code here 
       int n = str1.length();
       int m = str2.length();
       char c1[] = str1.toCharArray();
       char c2[] = str2.toCharArray();
       return lcs(c1,c2,n,m);
    }
     public static int lcs(char[] c1 , char[] c2,int n,int m){
         int dp[][] = new int[n+1][m+1];
         
         for(int i=0;i<=n;i++){
             for(int j=0;j<=m;j++){
                 if(i==0||j==0)dp[i][j]=0;
                 else if(c1[i-1]==c2[j-1]){
                     dp[i][j] = 1 + dp[i-1][j-1];
                 }
                 else{
                     dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                 }
             }
         }
         return dp[n][m];
     }
}