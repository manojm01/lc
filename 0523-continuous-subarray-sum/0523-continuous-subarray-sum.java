class Solution {
    public boolean checkSubarraySum(int[] a, int k) {
        int sum=0;
        HashMap<Integer,Integer> h = new HashMap<>();
        
        
        for(int i=0;i<a.length;i++){
            sum += a[i];
            int rem = sum%k;
            if(rem==0 && i>0)return true;
            if(h.containsKey(rem) && i-h.get(rem)>1)return true;
            if(!h.containsKey(rem)) h.put(rem,i);
        }
        return false;
    }
}