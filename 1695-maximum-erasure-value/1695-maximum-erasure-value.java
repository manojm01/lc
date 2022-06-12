class Solution {
    public int maximumUniqueSubarray(int[] a) {
        int n = a.length;
        int i=0,j=0;
        int ans = 0,sum=0;
        
        HashSet<Integer> set = new HashSet<>();
        
       while(i<n&&j<n){
           if(!set.contains(a[j])){
               sum += a[j];
               set.add(a[j]);
               j++;
               ans = Math.max(sum,ans);
           }
           else{
               sum -= a[i];
               set.remove(a[i]);
               i++;
               ans = Math.max(sum,ans);
           }
       }
        return ans;
    }
}