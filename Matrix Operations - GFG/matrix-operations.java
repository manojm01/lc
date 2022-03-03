// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            System.out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int [] endPoints(int [][]a, int m, int n){
        //code here
        int ans[] = new int[2];
        int i=0,j=0;
        int dir=1;
        while(i>=0&& j>=0 && i<m && j<n){
            ans[0]=i;
            ans[1]=j;
            if(a[i][j]==0){
                
               if(dir==1){
                   j++;
               }
               else if(dir==2){
                   i++;
               }
               else if(dir==3){
                   j--;
               }
               else if(dir==4){
                   i--;
               }
            }else{
               a[i][j]=0;
               if(dir==1){
                   i++;dir=2;
               }
               else if(dir==2){
                   j--;dir=3;
               }
               else if(dir==3){
                   i--;dir=4;
               }
               else if(dir==4){
                   j++;dir=1;
               }
            }
        }
        return ans;   
    }
}