// { Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine());
    
	    while(t > 0){
	        int n = Integer.parseInt(br.readLine());
	        Solution T = new Solution();
	        
	        System.out.println(T.excelColumn(n));
	        
            t--;
	    }
	}
    
}// } Driver Code Ends


//User function Template for Java

class Solution {
    public String excelColumn(int n){
        
        //  Your code here
        String ans = "";
        int x = n;
        while(x>0){
            x--;   // 0 index
            int c = x%26;  
            char cc = (char)(65+c);
            ans += cc;
            x = x/26;
         }
        return new StringBuilder(ans).reverse().toString();
        
    }
}