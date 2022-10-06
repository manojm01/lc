class Solution {
    public int countGoodSubstrings(String s) {
        int ans = 0;
        int i=0;
        while(i+3<=s.length()){
           if(check(s.substring(i,i+3))){
               ans++;
           }
            i++;
        }
        return ans;
    }
    public boolean check(String s){
         char c[] = s.toCharArray();
         if(c[1]!=c[0] && c[2]!=c[1] && c[2]!=c[0])return true;
         return false;
    }
}