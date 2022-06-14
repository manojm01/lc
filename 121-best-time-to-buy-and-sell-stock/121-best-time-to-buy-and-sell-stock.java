class Solution {
    public int maxProfit(int[] a) {
        int n = a.length;
        int ans = 0;
        int buy=a[0];
        
        for(int i=1;i<n;i++){
            if(a[i]<buy){
                buy=a[i];
            }    
            ans = Math.max(ans,a[i]-buy);
        }
        return ans;
    }
}