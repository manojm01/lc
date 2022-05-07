class Solution {
    public boolean increasingTriplet(int[] a) {
        // int min = Integer.MAX_VALUE;
        // int secmin = Integer.MAX_VALUE;
        // for(int i:a){
        //     if(i<=min)min=i;
        //     else if(i<=secmin)secmin=i;
        //     else return true;
        // }
        // return false;
        int n = a.length;
        int lmin[] = new int[n];
        int rmax[] = new int[n];
        lmin[0]=a[0];
        rmax[n-1]=a[n-1];
        
        for(int i=1;i<n;i++)lmin[i]=Math.min(lmin[i-1],a[i]);
        for(int i=n-2;i>=0;i--)rmax[i]=Math.max(rmax[i+1],a[i]);
        
        for(int i=0;i<n;i++){
            if(a[i]>lmin[i] && a[i]<rmax[i])return true;
        }
        return false;
    }
}