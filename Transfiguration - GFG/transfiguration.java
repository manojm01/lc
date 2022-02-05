// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String a, String b)
    {
    	// Your code goes here.
    	int ans = 0;
    	char ac[] = a.toCharArray();
    	char bc[] = b.toCharArray();
    	int c = 0;
    	for(int i=0;i<b.length();i++){
    	   c += ac[i]-bc[i];
    	}
    	if(c!=0)return -1;
    	int m = a.length()-1;
    	int n = b.length()-1;
    	
    	while(m>=0&&n>=0){
    	    if(ac[m]==bc[n]){
    	        m--;n--;
    	    }else{
    	        m--;ans++;
    	    }
    	}
    	
    	return ans;
    }
}