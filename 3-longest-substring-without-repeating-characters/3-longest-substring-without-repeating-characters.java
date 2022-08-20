class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=i;
        char c[] = s.toCharArray();
        
        while(i<s.length()){
            if(map.containsKey(c[i]) && map.get(c[i])>=j){
                j = map.get(c[i])+1;
            }
            map.put(c[i],i);
            ans = Math.max(ans,i-j+1);
            i++;
        }
        
        return ans;
    }
}