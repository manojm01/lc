class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        int m = a.length;
        int n = a[0].length;
        if(a[0][0]==1)return 0;
        int dp[][] = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
                if(a[i][j]!=1)
                   dp[i][j]=-1;
        }
        
        return solve(m-1,n-1,a,dp);
    }
    public int solve(int m,int n,int[][] a,int dp[][]){
         if(m>=0 && n>=0 && a[m][n]==1){
             System.out.println("called "+m+" "+n+" :"+dp[m][n]);
             return 0;
          }
        if(n==0 && m==0)return 1;
        if(m<0 || n<0)return 0;
        if(dp[m][n]!=-1)return dp[m][n];
        
        return dp[m][n]=solve(m-1,n,a,dp)+solve(m,n-1,a,dp);
    }
} 