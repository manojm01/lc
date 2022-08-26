class Solution {
    public boolean reorderedPowerOf2(int n) {
        String s = Integer.toString(n);
        int a[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            a[i] = s.charAt(i)-'0';
        }
        return permut(a,0);
    }
    public boolean isPower(int[] a){
        if(a[0]==0)return false;
        int n=0;
        for(int i:a)n=10*n+i;
        while(n>0 && ((n&1)==0))n>>=1;
        
        return n==1;
    }
    public boolean permut(int a[],int s){
        if(s==a.length)return isPower(a);
        
        for(int i=s;i<a.length;i++){
            swap(a,s,i);
            if(permut(a,s+1))return true;
            swap(a,s,i);
        }
        return false;
    }
    public void swap(int a[],int s,int i){
        int t = a[s];
        a[s] = a[i];
        a[i] = t;
    }
}