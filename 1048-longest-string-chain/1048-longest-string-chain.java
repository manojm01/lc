class Solution {
    public int longestStrChain(String[] w) {
        Arrays.sort(w,(a,b)->{
            if(a.length()==b.length()){
                return a.compareTo(b);
            }
            return a.length()-b.length();
        });
        int n = w.length;
        int ans = 0;
        HashMap<String,Integer> h = new HashMap<>();
        
        for(String s:w){
            int ls = 0; //longest substring
            for(int i=0;i<s.length();i++){
                String sub = s.substring(0,i)+s.substring(i+1);
                ls = Math.max(ls,h.getOrDefault(sub,0)+1);
            }
            h.put(s,ls);
            ans = Math.max(ans,ls);
        }
        return ans;
        
    }
}