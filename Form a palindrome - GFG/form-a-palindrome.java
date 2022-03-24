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
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.findMinInsertions(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int findMinInsertions(String s){
        // code here
        if (s == null || s.length() <= 1) {
            return 0;
        }
        if (isPalindrome(s)) {
            return 0;
        }
        int length = s.length();
        String reversedS =  new StringBuilder(s).reverse().toString();
        return length - longestCommonSubsequence(s, reversedS, length);
    }
    
    // O(n ^ 2) O(n ^ 2)
    int longestCommonSubsequence(String s1, String s2, int length) {
        int [][] dp = new int [length + 1][length + 1];
        for (int i = 0; i <= length; i++) {
            for (int j = 0; j <= length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[length][length];
    }
    
    // O(n)
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}