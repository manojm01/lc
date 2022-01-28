class Solution {
    public int longestConsecutive(int[] a) {
        int n = a.length;
        if(n<=1)return n;
        
        HashSet<Integer> s = new  HashSet<>();
        for(int i:a)s.add(i);
        
        int ans = 1;
        for(int i=0;i<n;i++){
            if(!s.contains(a[i]-1)){
                int cnt=1;
               int c = a[i];

                while(s.contains(c+1)){
                    cnt++;
                    c++;
                }
                 ans = Math.max(ans,cnt);
            }
           
        }
        return ans;
    }
}