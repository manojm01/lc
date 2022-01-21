// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
       ArrayList<String> l = new ArrayList<>();
       int i=0;int j=0;
       String s="";
       solve(i,j,m,n,l,s);
        return l;
    }
    public static void solve(int i,int j,int[][] m, int n, ArrayList<String> l,String s){
        if(i<0 || j<0 || i>n-1 || j>n-1 || m[i][j]==0)return;
        
        if(i==n-1 && j==n-1){
            l.add(s);
            // s="";
            return;
        }
        m[i][j]=0;
            solve(i+1,j,m,n,l,s+"D");
            solve(i,j+1,m,n,l,s+"R");
            solve(i-1,j,m,n,l,s+"U");
            solve(i,j-1,m,n,l,s+"L");
        
        m[i][j]=1;
        return;
    }
}