class Solution {
    public int subarraysDivByK(int[] a, int k) {
        int n = a.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        int ans = 0;
        int sum = 0;
        h.put(0,1);
        for(int i=0;i<n;i++){
            sum = (sum+a[i])%k;
            if(sum<0)sum+=k;
            ans += h.getOrDefault(sum,0);
            h.put(sum,h.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}