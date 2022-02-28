// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int N = Integer.parseInt(br.readLine().trim());

            int arr[][] = new int[(int)(N)][2];

            for (int j = 0; j < 2; j++) {
                String inputLine2[] = br.readLine().trim().split(" ");
                for (int i = 0; i < N; i++) {
                    arr[i][j] = Integer.parseInt(inputLine2[i]);
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.mostBalloons(N, arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int mostBalloons(int n, int a[][]) {
        // Code here
        int ans = 0;
        
        for(int i=0;i<n;i++){
            Map<Double,Integer> map = new HashMap<>();
            int cnt=0;
            for(int j=0;j<n;j++){
                if((a[i][1]==a[j][1])&&(a[i][0]==a[j][0])){
                    cnt++;
                    continue;
                }
                double sl = (double)(a[i][1]-a[j][1])/(double)(a[i][0]-a[j][0]);
                map.put(sl,map.getOrDefault(sl,0)+1);
             }
             for(int val:map.values()){
                  ans = Math.max(ans,val+cnt);
             }
            
        }
        return ans;
    }
}