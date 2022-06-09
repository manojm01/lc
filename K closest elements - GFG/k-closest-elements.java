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
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);


            int[] ans = new Solution().printKClosest(arr, n, k, x);
            for (int xx : ans) {
                System.out.print(xx + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {

class pair implements Comparable <pair>{
    int gap;
    int val;
    
    pair(int val,int gap){
    this.val=val;
    this.gap=gap;
}

public int compareTo(pair o){
    if(this.gap!=o.gap){
        return this.gap-o.gap;
    }else{
         return o.val-this.val;
     }
}
}
int[] printKClosest(int[] arr, int n, int k, int x) {

    PriorityQueue<pair> pq=new PriorityQueue<>(Collections.reverseOrder());

    for(int i=0;i<arr.length;i++){
        if(x==arr[i]){continue;}
        
        pq.add(new pair(arr[i],Math.abs(x-arr[i])));
        
        if(pq.size()>k){
            pq.poll();
        }
    }
    
    int[] ans=new int[k];
    int i=pq.size()-1;
    while(pq.size()>0){
        pair rem=pq.poll();
        ans[i--]=rem.val;
    }
    return ans;
}
}
// this solution right if x is present in an array

        // int p = 0;
        // for(int i=0;i<n;i++){
        //     if(a[i]==x){
        //         p=i;break;
        //     }
        // }
        // int i=p-1,j=p+1;
        // int in=0;
        // while(i>=0 && j<n){
        //     if(in==k)break;
        //     if(a[j]-x<x-a[i] || a[j]-x==x-a[i]){
        //         ans[in++]=a[j];
        //         j++;
        //     }
        //     else{
        //         ans[in++]=a[i];
        //         i--;
        //     }
        // }
        // if(in<k){
        //     while(i>=0){
        //         ans[in++] = a[i];
        //         i--;
        //      if(in==k)break;
        //     }
        //     while(j<n){
        //         ans[in++] = a[j];
        //         j++;
        //         if(in==k)break;
        //     }
        // }