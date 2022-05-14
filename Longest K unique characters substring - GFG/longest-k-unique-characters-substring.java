// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        char c[] = s.toCharArray();
        int n = s.length();
        int ans = -1;
        int a[] = new int[26];
        int start=0;
        int cnt=0;
        
        for(int end=0;end<n;end++){
            if(a[c[end]-'a']==0)cnt++;
            a[c[end]-'a']++;
            
            while(cnt>k){
                a[c[start]-'a']--;
                if(a[c[start]-'a']==0)cnt--;
                start++;
                
            }
                if(cnt==k)ans = Math.max(ans,end-start+1);
        }
        
        return ans;
    }
}

//  for(int i=0;i<n;i++){
//             int cnt=0;
//             String str = "";
//             for(int j=i;j<n;j++){
//                 if(str.indexOf(c[j]+"")==-1){
//                     cnt++;
//                 }
//                 str += c[j];
//                 if(cnt == k){
//                     ans = Math.max(str.length(),ans);
//                 }
//             }
//         }