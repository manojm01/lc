class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0)return 0;
        int ans = 1;
        for(int i=0;i<n;i++){
            HashSet<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            int cnt=1;
            for(int j=i+1;j<n;j++){
                if(set.contains(s.charAt(j)))break;
                set.add(s.charAt(j));
                cnt++;
                ans = Math.max(ans,cnt);
            }
        }
        return ans;
    }
}