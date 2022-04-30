// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Main 
{
    	public static void main (String[] args) throws Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int g = 0;g < t;g++)
        {
            String[] str = (br.readLine()).trim().split(" ");
            int M = Integer.parseInt(str[0]);
            int N = Integer.parseInt(str[1]);
            
            int[] x = new int[M];
            str = (br.readLine()).trim().split(" ");
            for(int i = 0;i< M;i++)
                x[i] = Integer.parseInt(str[i]);
                
            str = (br.readLine()).trim().split(" ");
            int[] y = new int[N];
            for(int i = 0;i< N;i++)
            {
                y[i] = Integer.parseInt(str[i]);
                
            }
            System.out.println(new Solution().countPairs(x, y, M, N));
           
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    // x[], y[]: input array elements
    // M, N: size of arrays x[] and y[] respectively
    //Function to count number of pairs such that x^y is greater than y^x.
    static long countPairs(int x[], int y[], int m, int n)
    {
        // your code here
        Arrays.sort(x);   
        Arrays.sort(y);
        
        int zero=0,one=0,two=0,three=0,four=0;
        
        for(int i:y){
            if(i==0)zero++;
            else if(i==1)one++;
            else if(i==2)two++;
            else if(i==3)three++;
            else if(i==4)four++;
        }
        
        long ans=0;
        for(int i:x){
            if(i==0)continue;
            else if(i==1){
                ans += zero;
            }
            else if(i==2){
               int index = getIndex(y,n,2);
               if(index!=-1)
                 ans += n-index;
               ans += one+zero; 
               ans -= three; 
               ans -= four; 
            }
            else{
                int index = getIndex(y,n,i);
               if(index!=-1)
                 ans += n-index;
               ans += one+zero;
               if(i==3)
               ans += two; 
            }
        }
            return ans;
        
    }
    static int getIndex(int y[],int n,int e){
        int l=0;
        int h=n-1;
        int ans = -1;
        
        while(l<=h){
            int mid = (l+h)/2;
            if(y[mid]>e){
                ans = mid;
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
            return ans;
    }
}