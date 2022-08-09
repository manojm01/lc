class Solution {
    public int numFactoredBinaryTrees(int[] a) {
        Arrays.sort(a);
        
        HashMap<Integer,Long> map = new HashMap<>();
        long ans = 0;
      
        long cnt=1;
        map.put(a[0],cnt);
        
        for(int i=1;i<a.length;i++){
            cnt=1;
            for(int n:map.keySet()){
                if(a[i]%n==0 && map.containsKey(a[i]/n)){
                    cnt += map.get(n)*map.get(a[i]/n);
                }
            }
            map.put(a[i],cnt);
        }
        // System.out.println(map);
        for(int i:map.keySet()){
            ans = (ans+map.get(i)) % ((int)Math.pow(10,9)+7);
        }
        return (int)ans;
    }
}