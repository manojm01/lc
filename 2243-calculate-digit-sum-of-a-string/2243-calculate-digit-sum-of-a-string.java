class Solution {
    public String digitSum(String s, int k) {
        String ans = "";
        int n = s.length();
        int i=0;
        if(n<=k)return s;
        for(i=0;i<(n-(n%k));){
            ans += sum(s.substring(i,i+k));
            i+=k;
        }
         
        if(i<=n-1){
            ans += (sum(s.substring(i,n)));
        }
        // System.out.println(ans);
        if(ans.length()>k){
            return digitSum(ans,k);
        }
        return ans;
    }
    public int sum(String s){
        int ans = 0;
        
        for(char c:s.toCharArray()){
            ans += (c-'0');
        }
        return ans;
    }
}