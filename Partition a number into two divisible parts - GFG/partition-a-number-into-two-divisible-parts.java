// { Driver Code Starts
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
            String str[] = read.readLine().split(" ");
            String S= str[0];
            int a = Integer.parseInt(str[1]);
            int b = Integer.parseInt(str[2]);
            Solution ob = new Solution();
            System.out.println(ob.stringPartition(S,a,b));
        }
    }
}// } Driver Code Ends


//User function Template for Java
class Solution{
    static String stringPartition(String s, int a, int b){
        // code here
        String ans = "-1";
        int n = s.length();
        for(int i=1;i<s.length();i++){
            int x = Integer.parseInt(s.substring(0,i));
            int y = Integer.parseInt(s.substring(i,n));
            
            if(x%a==0 && y%b==0){
                ans = s.substring(0,i) + " "+s.substring(i,n);
                return ans;
            }
        }
        return ans;
    }
}