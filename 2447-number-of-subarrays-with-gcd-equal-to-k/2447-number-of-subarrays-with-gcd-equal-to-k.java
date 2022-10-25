class Solution {
    public int subarrayGCD(int[] a, int k) {
        int ans = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(fun(a,i,j)==k)ans++;
            }
        }
        return ans;
    }
    public int gcd(int a,int b){
        if(a==0)return b;
        return gcd(b%a,a);
    }
    public int fun(int a[],int l,int r){
        int ans=a[l];
        for(int i=l;i<=r;i++){
            ans = gcd(ans,a[i]);
            if(ans==1)return 1;
        }
        return ans;
    }
}