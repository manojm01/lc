class Solution {
    public int subsetXORSum(int[] a) {
        return f(a,0,0);
    }
    public int f(int a[],int i, int x){
        if(i==a.length)return x;
        
        return f(a,i+1,a[i]^x)+f(a,i+1,x);
    }
}