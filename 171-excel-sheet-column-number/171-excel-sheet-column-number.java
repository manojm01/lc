class Solution {
    public int titleToNumber(String s) {
        char c[] = s.toCharArray();
        int ans = 0;
        int n = s.length();
        int in = 0;
        for(int i=n-1;i>=0;i--){
            int x = c[i]-'A'+1;
            ans += Math.pow(26,in)*x;
            in++;
        }
        return ans;
    }
}