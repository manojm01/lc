class Solution {
    public int findPairs(int[] a, int k) {
        int ans = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        int n = a.length;
        
        for(int i:a){
            h.put(i,h.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> itr: h.entrySet()){
            if(k==0){
                if(itr.getValue()>=2){
                    ans++;
                }
            }
            else{
                if(h.containsKey(itr.getKey()+k)){
                    ans++;
                }
            }
        }
        return ans;
    }
}