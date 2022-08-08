class Solution {
    public int findShortestSubArray(int[] a) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int n = a.length;
        int ans = n;
        int maxF=0;int maxE=0;
        
        ArrayList<Integer> l = new ArrayList<>();
        for(int i:a){
            map.put(i,map.getOrDefault(i,0)+1);
            if(map.get(i)>maxF){
                maxF=map.get(i);
                maxE=i;
            }
        }
        for(int i:a){
            if(map.get(i)==maxF && !l.contains(i))l.add(i);
        }
    
        for(int i:l){
            int s=0,e=n-1;
            while(a[s]!=i)s++;
            while(a[e]!=i)e--;
            ans = Math.min(ans,e-s+1);
        }
     
        
        return ans;
    }
}