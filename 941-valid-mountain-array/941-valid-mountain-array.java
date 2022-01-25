class Solution {
    public boolean validMountainArray(int[] a) {
        int n = a.length;
        if(n<3)return false;
        int c = 0;
        for(int i=1;i<n-1;i++){
            if(a[i]==a[i-1] || a[i]==a[i+1]){
                return false;
            }
            if(a[i]>a[i-1] && a[i]>a[i+1]){
                c++;
            }
            if(a[i]<a[i-1] && a[i]<a[i+1]){
                return false;
            }
        }
        return c==1?true:false;
    }
}