// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String str = read.readLine().trim(); 
            Solution obj = new Solution();
            int ans = obj.palindromeSubStrs(str);
            System.out.println(ans);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution 
{   
    //     Set<String> set = new HashSet<>();
    // int palindromeSubStrs(String str) { 
    //     // code here
    //     int n = str.length();
    //     set.clear();
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<=n;j++){
    //             // String s = str.substring(i,j);
    //             if(check(str.substring(i,j)))
    //               set.add(str.substring(i,j));
    //          }
    //     }
       
    //     return set.size();
    // }
    // boolean check(String s){
    //     int n = s.length();
    //     if(n==1)return true;
    //     int i = 0;
    //     int j = n-1;
    //     while(i<j){
    //         if(s.charAt(i)!=s.charAt(j))return false;
    //         i++;j--;
    //     }
    //     return true;
    // }
    static HashSet<String> hash = new HashSet<>();
   public static boolean find(String s,int start,int end) {
       int n = end - start + 1;
       if(n==1) return true;
       for (int i = 0; i < n/2; i++) 
        if (s.charAt(start+i) != s.charAt(end - i)) return false;
       return true;
   }
   int palindromeSubStrs(String s) { 
       hash.clear();
       for(int i = 0;i<s.length();i++ )
       for(int j = i;j<s.length();j++ ) 
         if(find(s,i,j)) hash.add(s.substring(i,j+1)); 
       return hash.size();
   }
} 