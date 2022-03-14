// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int n = Integer.parseInt(S[0]);
            int e = Integer.parseInt(S[1]);
            
            String S1[] = read.readLine().split(" ");
            int[] arr = new int[2*e];
            
            for(int i=0; i<2*e; i++)
                arr[i] = Integer.parseInt(S1[i]);

            Solution ob = new Solution();
            System.out.println(ob.biGraph(arr,n,e));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int biGraph(int[] arr, int n, int e) {
        // code here
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(new ArrayList<>());
        }
        if(n<=2)return 1;
        for(int i=0;i<arr.length-1;i+=2){
            int u = arr[i];
            int v = arr[i+1];
            l.get(u).add(v);
            l.get(v).add(u);
        }
        for(ArrayList<Integer> i:l){
            if(i.size()<=1)return 0;
        }
        return 1;
    }
};