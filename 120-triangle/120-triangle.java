class Solution {
    public int minimumTotal(List<List<Integer>> a) {
        int n = a.size();
        int dp[][] = new int[n][n];
        
        for(int i=0;i<n;i++){
            dp[n-1][i] = a.get(n-1).get(i);
        }
        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d = a.get(i).get(j) + dp[i+1][j];
                int dia = a.get(i).get(j) +  dp[i+1][j+1];
                
                dp[i][j] = Math.min(d,dia);
            }
        }
        return dp[0][0];
        
        
        // return solve(0,0,a,dp);
    }
    
    
//     public int solve(int i,int j,List<List<Integer>> a, int[][] dp){
//         if(i == a.size()-1){
//             return a.get(a.size()-1).get(j);
//         }
        
//         if(dp[i][j]!=0)return dp[i][j];
//         int d = a.get(i).get(j) + solve(i+1,j,a,dp);
//         int dia = a.get(i).get(j) + solve(i+1,j+1,a,dp);
        
//         dp[i][j] = Math.min(d,dia);
//         return dp[i][j];
//         // return Math.min(d,dia);
        
//     }
}