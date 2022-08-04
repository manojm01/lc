class Solution {
    public int minDistance(String word1, String word2) {
        return word1.length()+word2.length()-2*lcs(word1,word2);
    }
    public int lcs(String s, String t){
        int n = s.length();
        int m = t.length();
        int dp[][] = new int[n+1][m+1];
        
        for(int i=0;i<n;i++)if(i==0)dp[i][0]=0;
        for(int i=0;i<m;i++)if(i==0)dp[0][i]=0;
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s.charAt(i-1)==t.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
}