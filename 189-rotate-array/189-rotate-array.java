class Solution {
    public void rotate(int[] a, int k) {
        int n = a.length;
        if(n==1)return;
         k=k%n;
        reverse(a,0,n);
        reverse(a,0,k);
        reverse(a,k,n);
    }
    public void reverse(int[] a,int i,int j){
        int l=i;int r=j-1;
        while(l<r){
            int t = a[l];
            a[l] = a[r];
            a[r] =t;
            l++;
            r--;
        }
    }
        
}