class Solution {
    public int missingNumber(int[] a) {
        int s=0;int n = a.length;
        for(int i:a)s += i;
        return (n*(n+1)/2)-s;
        
      //   int xor=0;
      // for(int i=1;i<=a.length;i++){
      //     xor ^= i;
      // }
      //   for(int j:a)xor ^= j;
      //   return xor;
    }
}