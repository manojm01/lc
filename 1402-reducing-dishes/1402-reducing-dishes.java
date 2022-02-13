class Solution {
    public int maxSatisfaction(int[] a) {
        int n = a.length;
        int ans = 0;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            // System.out.print(a[i]+" ");
            // System.out.println();
            int max = a[i];
            int m=2;
            for(int j=i+1;j<n;j++){
                max += a[j]*m;
                m++;
            }
            // System.out.print(max+" ");
            ans = Math.max(ans,max);
        }
        return ans;
        
    }
}