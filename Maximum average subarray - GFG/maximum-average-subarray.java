// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().findMaxAverage(arr, n, k);
            for(int i=ans; i<ans+k; i++)
                System.out.print(arr[i]+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int findMaxAverage(int[] a, int n, int k) {
        // code here
        int ans = 0;
        int s = 0;
        for(int i=0;i<k;i++){
            s += a[i];
        }
        int pre = s;
        ans = 0;
        //  System.out.print(pre+" ");
        for(int i=1;i<n-k+1;i++){
            s = s+a[i+k-1]-a[i-1];
            // System.out.print(s+" ");
            if(s > pre){
                ans = i;
                pre = s;
            }
        }
        return ans;
    }
}
