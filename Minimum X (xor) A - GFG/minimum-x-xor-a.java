// { Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {

            int a = Integer.parseInt(br.readLine().trim());
            int b = Integer.parseInt(br.readLine().trim());

            Solution ob = new Solution();
            System.out.println(ob.minVal(a, b));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int minVal(int a, int b) {
        // code here
        int sa = 0, na = 0;
        int sb = 0, nb = 0;
        int aa = a;
        int bb = b;
        
        while(aa>0){
            sa += (aa & 1);
            aa = aa>>1;
            na++;
        }
        while(bb>0){
            sb += (bb & 1);
            bb = bb>>1;
            nb++;
        }
        int diff = sa-sb;
        
        if(sa==sb)return a;
        else if(sa<sb){
            while(diff<0){
                a = a | (a+1);
                diff++;
            }
        }
        else{
            while(diff>0){
                a = a & (a-1);
                diff--;
            }
        }
        
        return a;
    }
}