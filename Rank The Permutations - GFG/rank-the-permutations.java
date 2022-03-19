// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String str = br.readLine().trim();
            Solution obj = new Solution();
            long ans = obj.findRank(str);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{   ArrayList<Long> l = new ArrayList<>();
    long ans = 0;
    public long findRank(String s)
    {
        // Code here
        int n = s.length();
        if(n==1)return 1;
        factorial();
        solve(s);
        
        return ans;
    }
    public void factorial(){
        int i=0;
        long f = 1;
        
        while(i<20){
            f = f*(i+1);
            l.add(f);
            i++;
        }
    }
    public void solve(String s){
        int n = s.length();
        if(n==2){
            if(s.charAt(0)<s.charAt(1))ans++;
            else ans += 2;
            return;
        }
        char c[] = s.toCharArray();
        Arrays.sort(c);
        String newStr = new String(c);
        int pos = 0;
        
        for(int i=0;i<newStr.length();i++){
            if(s.charAt(0)==newStr.charAt(i)){
                pos = i;
                break;
            }
        }
        long lower = (l.get(n-1)/n)*pos;
        ans += lower;
        
        s = s.substring(1);
        
        solve(s);
    
    } 
}