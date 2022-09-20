class Solution {
    int ans = 0;
    public int findLength(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int ans = 0;
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0)dp[i][j]=0;
                else{
                    if(a[i-1]==b[j-1]){
                        dp[i][j] = 1 + dp[i-1][j-1];
                        ans = Math.max(ans,dp[i][j]);
                    }
                }
            }
        }
        return ans;
        
    }
}