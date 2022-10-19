class Solution {
    public List<String> topKFrequent(String[] str, int k) {
        List<String> ans = new ArrayList<String>();
        List<Integer> v = new ArrayList<Integer>();
        TreeMap<String,Integer> h = new TreeMap<>();
        
        for(String s:str)h.put(s,h.getOrDefault(s,0)+1);
        for(int i:h.values())if(!v.contains(i))v.add(i);
        Collections.sort(v, Collections.reverseOrder()); 
        System.out.println(h);
        
        
        for(int i:v){
            for(Map.Entry<String,Integer>itr:h.entrySet()){
                if(i==itr.getValue())ans.add(itr.getKey());
                if(ans.size()==k)return ans;
            }
             // System.out.println(ans);
            // if(ans.size()==k)return ans;
        }
        return ans;
        
    }
}