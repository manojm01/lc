// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String str = br.readLine();
            
            Solution obj = new Solution();
            System.out.println(obj.findSubString(str));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    public int findSubString( String s) {
        // Your code goes here
        int n = s.length();
        String o = "";
        for(char c:s.toCharArray()){
            if(!o.contains(c+""))o+=c;
        }
        int l = o.length();
        char c[] = s.toCharArray();
        int ans = Integer.MAX_VALUE;
        int cnt = 0;
         char m[] = new char[256];
         m[c[0]]++;
         cnt++;
         
        int i=0,j=1;
        
        while(i<=j && j<n){
            if(cnt<l){
                if(m[c[j]]==0)cnt++;
                m[c[j]]++;
                j++;
            }
            else if(cnt==l){
                ans = Math.min(ans,j-i);
                if(m[c[i]]==1)cnt--;
                m[c[i]]--;
                i++;
            }
        }
        while(cnt==l){
             ans = Math.min(ans,j-i);
                if(m[c[i]]==1)cnt--;
                m[c[i]]--;
                i++;
        }
        return ans;
    }
}