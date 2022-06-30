class Solution {
    public int minMoves2(int[] a) {
        Arrays.sort(a);
        int n = a.length;
        int x = n/2;
        int ans= 0;
        for(int i=0;i<n;i++){
            ans += Math.abs(a[i]-a[x]);
        }
        return ans;
    }
}