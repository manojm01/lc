class Solution {
    public int minimumCardPickup(int[] a) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int ans = Integer.MAX_VALUE;
        
        for(int i=0;i<a.length;i++){
            if(m.containsKey(a[i])){
                ans = Math.min(ans,i-m.get(a[i])+1);
            }
            m.put(a[i],i);
        }
        if(ans == Integer.MAX_VALUE)ans=-1;
        return ans;
    }
}