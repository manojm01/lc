class Solution {
    public int minSubArrayLen(int t, int[] a) {
        int n = a.length;
        int p[] = new int[n];
        int ans = n+1;
        
        p[0] = a[0];
        for(int i=1;i<n;i++){
            p[i] = p[i-1]+a[i];
        }
       for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            int sum = p[j]-p[i]+a[i];
            if(sum>=t){
                 ans = Math.min(ans,j-i+1);
            }
         }
       }
        if(ans==n+1)ans=0;
        return ans;
    }
}