class Solution {
    public boolean isSubsequence(String s, String t) {
        int m = s.length();
        int n = t.length();
        return fun(s,t,m,n);
    }
    public boolean fun(String s, String t, int m, int n){
        if(m==0)return true;
        if(n==0)return false;
        
        if(s.charAt(m-1)==t.charAt(n-1))return fun(s,t,m-1,n-1);
        else return fun(s,t,m,n-1);
    }
}