class Solution {
    public int numJewelsInStones(String j, String s) {
        int ans = 0;
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(j.indexOf(ch)!=-1)ans++;
        }
        return ans;
    }
}