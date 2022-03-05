class Solution {
    public int deleteAndEarn(int[] a) {
        int n = a.length;
        int fr[] = new int[10001];
        int max=0;
        for(int i:a){
            fr[i]++;
            max = Math.max(max,i);
        }
        int dp[] = new int[max+1];
        dp[1] = fr[1];
        
        for(int i=2;i<=max;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+fr[i]*i);
        }
        return dp[max];
        
    }
}