class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int ans=0;
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        
       boolean f = false;
        for(Map.Entry<String,Integer> i:map.entrySet()){
            String str = i.getKey();
            int cnt = i.getValue();
            
            if(str.charAt(1)==str.charAt(0)){
                if(cnt%2==0){
                  ans += cnt;
                }
                else{
                    ans += cnt-1;
                    f=true;
                }
            }
            else if(str.charAt(1)>str.charAt(0)){
                String rx = "" + str.charAt(1) + str.charAt(0);
                if(map.containsKey(rx)){
                    ans += 2*(Math.min(cnt,map.get(rx)));
                }
            }
        }
       
        if(f)ans++;
        return ans*2;
    }
}