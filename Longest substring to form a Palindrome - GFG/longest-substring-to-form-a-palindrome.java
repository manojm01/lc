// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstring(S));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int longestSubstring(String s) {
        // code here
        int n = s.length();
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        
        int mask = 0;
        map.put(mask, -1);
         for (int i = 0; i < s.length(); i++) {

            int temp = (int) s.charAt(i) - 'a';

            mask ^= (1 << temp);

            if (map.containsKey(mask)) {
                ans = Math.max(ans, i - map.get(mask));
            } else {
                map.put(mask, i);
            }

            for (int j = 0; j < 26; j++) {
                int mask2 = mask ^ (1 << j);
                if (map.containsKey(mask2)) {
                    ans = Math.max(ans, i - map.get(mask2));
                }
            }
        }
        return ans;
    }
};

 // int a[] = new int[26];
        // int ans =1;
        // for(char c:s.toCharArray()){
        //     a[c-'a']++;
        //     int twos=0;
        //     int ones=0;
        //     for(int i=0;i<26;i++){
        //       if(a[i]!=0 && a[i]%2==0){
        //           twos += a[i];
        //       }
        //       else if(a[i]==1){
        //           ones++;
        //       }
        //     }
        //     if(ones>1)ones=1;
        //     int x = twos + ones;
        //     ans = Math.max(ans,x);
        // }