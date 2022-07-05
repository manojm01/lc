class Solution {
    public int longestConsecutive(int[] a) {
        int n = a.length;
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for(int i:a)set.add(i);
        for(int i=0;i<n;i++){
            int x = a[i];
            int cnt = 1;
            if(!set.contains(x-1)){
                while(set.contains(x+1)){
                    cnt++;
                    x++;
                }
                ans = Math.max(cnt,ans);
            }
        }
        return ans;
    }
}