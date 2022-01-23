class Solution {
    public int[] rearrangeArray(int[] a) {
        int n = a.length;
        
        int p[] = new int[n/2];
        int ne[] = new int[n/2];
         int ans[] = new int[n];
        int ip=0;int in=0;
        for(int i=0;i<n;i++){
            if(a[i]<0){
                p[ip++]=a[i];
            }
            else{
                ne[in++]=a[i];
            }
        }
        ip=0;in=0;
        for(int i=0;i<n;i++){
            if(i%2==1){
                ans[i] = p[ip++];
            }
            else{
                ans[i] = ne[in++];
            }
        }
        return ans;
    }
}