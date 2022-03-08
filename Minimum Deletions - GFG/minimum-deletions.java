// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.minimumNumberOfDeletions(S));
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int minimumNumberOfDeletions(String s) {
        //your code here
        String r = new StringBuilder(s).reverse().toString();
        char a[] = s.toCharArray();
        char b[] = r.toCharArray();
        int n = s.length();
        int d[][] = new int[n+1][n+1];
        
        for(int i=0;i<n+1;i++){
            for(int j=0;j<n+1;j++){
                if(i==0||j==0){
                    d[i][j]=0;
                }
                else if(a[i-1]==b[j-1]){
                    d[i][j] = 1+d[i-1][j-1];
                }
                else{
                    d[i][j] = Math.max(d[i-1][j],d[i][j-1]);
                }
            }
        }
        return n-d[n][n];
    }
}