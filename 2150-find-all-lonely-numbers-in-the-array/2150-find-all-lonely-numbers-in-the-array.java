class Solution {
    public List<Integer> findLonely(int[] a) {
        List<Integer> ans = new ArrayList<>();
        int n = a.length;
       
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        }
        
        for(int i=0;i<n;i++){
            if(h.get(a[i])!=1 || h.containsKey(a[i]-1) || h.containsKey(a[i]+1)){
                continue;           
            }
            else{
                ans.add(a[i]);
            }
        }
        return ans;
        
    }
}