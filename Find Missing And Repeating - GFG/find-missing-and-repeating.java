// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().split(" ");

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int[] ans = new Solve().findTwoElement(a, n);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solve {
    int[] findTwoElement(int a[], int n) {
        // code here
           int ans[] = new int[2];
           
           for(int i=0;i<n;i++){
               int index = Math.abs(a[i])-1;
               if(a[index]<0){
                   ans[0]=index+1;
               }
               else
                 a[index] = -a[index];
           }
     
           for(int i=0;i<n;i++){
               if(a[i]>0){
                   ans[1]=i+1;
                   
               }
           } 
           return ans;
            
          
            
    }
}