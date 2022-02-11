class Solution {
    public String frequencySort(String s) {
        TreeMap<Character,Integer> m = new TreeMap<>();
        int n = s.length();
        
        for(char c:s.toCharArray()){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)-> b.getValue()-a.getValue());
        
        pq.addAll(m.entrySet());
        
        String ans = "";
        
        while(!pq.isEmpty()){
            Map.Entry e = pq.poll();
            int f = (int)e.getValue();
            while(f-->0){
                ans += e.getKey();
            }
         }
        return ans;
    }
}