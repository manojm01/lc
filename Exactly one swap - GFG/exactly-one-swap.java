// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            long ans = ob.countStrings(S); 
            System.out.println(ans);
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    long countStrings(String s) 
    { 
        // code here
        int c = 0;
        long n = s.length();
        long f[] = new long[26];
        String x="";
        for(int i=0;i<n;i++){
            f[s.charAt(i)-'a']++;
            // if(x.indexOf(ch)!=-1)c++;
            // x+=ch;
        }
        long m = 0 ;
        for(int i=0;i<26;i++){
           m +=  f[i]*(f[i]-1)/2;
        }
        long total = (n*(n-1)/2);
        
        if(m>0)return total+1-m;
        return total-m;
    }
}