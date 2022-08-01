class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n==0)return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0,j=0;
        int ans = 0;
        char c[] = s.toCharArray();
        
        for(j=0;j<n;j++){
            if(map.containsKey(c[j])){
                i = Math.max(i,map.get(c[j])+1);
            }
            ans = Math.max(ans,j-i+1);
            map.put(c[j],j);
        }
        return ans;
    }
}

        //int ans = 1;
        // for(int i=0;i<n;i++){
        //     HashSet<Character> set = new HashSet<>();
        //     set.add(s.charAt(i));
        //     int cnt=1;
        //     for(int j=i+1;j<n;j++){
        //         if(set.contains(s.charAt(j)))break;
        //         set.add(s.charAt(j));
        //         cnt++;
        //         ans = Math.max(ans,cnt);
        //     }
        // }
        // return ans;