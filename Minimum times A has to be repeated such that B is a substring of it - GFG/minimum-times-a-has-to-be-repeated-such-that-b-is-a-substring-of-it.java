// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine();
            String B = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.minRepeats(A,B));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int minRepeats(String a, String b) {
        // code here
        int n = a.length();
        int m = b.length();
        int r = (m/n)+1;
        
        String s = "";
        int f=r;
        while(r-->0){
            s += a;
        }
        // System.out.println(s+"="+a );
        int ans = f;
        if(s.indexOf(b)==-1)return -1;
        else{
            s = s.substring(n,s.length());
            if(s.indexOf(b)!=-1)ans = f-1;
        }
         return ans;
    }
};