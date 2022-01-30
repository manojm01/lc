// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int a[][] = new int[n][n];
		    
		    for(int i=0;i<n;i++)
		    {
		        for(int j=0;j<n;j++)
		        {
		            a[i][j] = Integer.parseInt(sc.next());
		        }
		    }
		    
		    int k = Integer.parseInt(sc.next());
		    Solution T = new Solution();
		    System.out.println(T.Maximum_Sum(a,n,k));
		}
	}
}// } Driver Code Ends


class Solution
{
    public int Maximum_Sum(int a[][],int n,int k){
        // Your code goes here
        int ans = 0;
        int s[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if(i==0&&j==0)s[i][j]=a[i][j];
               else if(i==0)s[i][j]=a[i][j]+s[i][j-1];
               else if(j==0)s[i][j]=a[i][j]+s[i-1][j];
               else s[i][j]=a[i][j]+s[i-1][j]+s[i][j-1]-s[i-1][j-1];
            }
        }
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         System.out.print(s[i][j]+" ");
        //     System.out.println();
        // }
        if(k==n)return s[n-1][n-1];
        int sum=0;
        for(int i=k-1;i<n;i++){
            for(int j=k-1;j<n;j++){
                if(i==k-1&&j==k-1)sum=s[i][j];
                else if(i==k-1) sum = Math.max(sum,s[i][j]-s[i][j-k]);
                else if(j==k-1) sum = Math.max(sum,s[i][j]-s[i-k][j]);
                else sum = Math.max(sum,s[i][j]-s[i][j-k]-s[i-k][j]+s[i-k][j-k]);
                ans = Math.max(ans,sum);
            }
        }
        return sum;
    }
}
