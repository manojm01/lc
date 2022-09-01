class Solution {
    public int numSplits(String s) {
        int ans =0 ;
        Map<Character,Integer>l = new HashMap<>();
        Map<Character,Integer>r = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
           r.put(s.charAt(i),r.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
           l.put(ch,l.getOrDefault(ch,0)+1);
           r.put(ch,r.getOrDefault(ch,0)-1);
            
           if(r.get(ch)<=0)r.remove(ch);
           if(r.size()==l.size())ans++; 
        }
        return ans;
    }
}