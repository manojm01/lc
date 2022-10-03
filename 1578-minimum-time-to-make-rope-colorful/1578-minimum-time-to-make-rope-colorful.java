class Solution {
    public int minCost(String s,int[] a) {
        char c[] = s.toCharArray();
        int ans = 0;
        int l = 0,r=0;
        int n = a.length;
        while(l<n && r<n){
            int total = 0;
            int curmax = 0;
            while(r<n && c[l]==c[r]){
                total += a[r];
                curmax = Math.max(curmax,a[r]);
                r++;
            }
            ans += total-curmax;
            l=r;
        }
        return ans;
    }

}