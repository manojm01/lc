class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        char c[] = s.toCharArray();
        
       int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int j=0;
        for(int i=0;i<n;i++){
            if(map.containsKey(c[i])){
                j = Math.max(j,map.get(c[i])+1);
            }
            map.put(c[i],i);
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}