class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String t = new StringBuilder(s).reverse().toString();
        int max = lcs(s,t);
        return max;
    }
    public int lcs(String s,String t){
        int n=s.length();
        int m=n;
        int dp[][] = new int[n][m];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return fun(s,t,n-1,n-1,dp);
    }
    
    public int fun(String s, String t,int i,int j,int[][] dp){
        if(i<0 || j<0)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
        
        if(s.charAt(i)==t.charAt(j)){
            return dp[i][j] = 1+fun(s,t,i-1,j-1,dp);
        }
        else{
            return dp[i][j] = Math.max(fun(s,t,i-1,j,dp),fun(s,t,i,j-1,dp));
        }
    }   
}
