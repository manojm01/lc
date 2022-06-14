class Solution {
    public int maxSubArray(int[] a) {
        int n = a.length;
        
        int dp[] = new int[n];
        dp[0] = a[0];
        int ans = a[0];
        for(int i=1;i<n;i++){
            dp[i] = Math.max(dp[i-1]+a[i],a[i]);
            ans = Math.max(ans,dp[i]);
        }
         return ans;  
    }
}