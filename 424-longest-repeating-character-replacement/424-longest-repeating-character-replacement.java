class Solution {
    public int characterReplacement(String s, int k) {
        char c[] = s.toCharArray();
        int n = s.length();
        int ans = 0;
        int l = 0;
        int fr[] = new int[26];
        int maxFr = 0;
        for(int r=0;r<n;r++){
           fr[c[r]-'A']++;
            maxFr = Math.max(maxFr,fr[c[r]-'A']);
            
            int charsToremove = (r-l+1)-maxFr;
            
            if(charsToremove > k){
                fr[c[l]-'A']--;
                l++;
            }
            ans = Math.max(ans,r-l+1);
        }
        return ans;
    }
}