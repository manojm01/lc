class Solution {
    public int romanToInt(String s) {
        char c[] = s.toCharArray();
        
        Map<Character,Integer> map = new HashMap<>(){{
             put('I',1);
            put('V',5);
            put('X',10);
            put('L',50);
            put('C',100);
            put('D',500);
            put('M',1000);
        }};
        int ans = 0;
        int n = s.length();
        // ans = map.get(c[n-1]);
        
        for(int i=n-1;i>=0;i--){
            if(i>0 && map.get(c[i])>map.get(c[i-1])){
                ans = ans + map.get(c[i])-map.get(c[i-1]);
                i--;
            }
            else{
                 ans += map.get(c[i]);
            }
        }
        return ans;
    }
}