// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.newIPAdd(s));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String newIPAdd(String s)
    {
        // your code here
        int n = s.length();
        String ans = "";
        char c[] = s.toCharArray();
        int i=0;
        boolean nz = false;
        while(i<n){
            if(c[i]=='.'){
                nz = false;
            }
            else if(!nz && i<n-1 && c[i]=='0' && c[i+1]!='.'){
                i++;
               continue;
            }
            else{
                nz = true;
            }
            ans += c[i++];
        }
        return ans;
    }
}