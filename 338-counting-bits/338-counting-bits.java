class Solution {
    public int[] countBits(int n) {
        int a[] = new int[n+1];
        
        for(int i=1;i<n+1;i++){
            a[i] = a[i>>1]+(i%2);
        }
        return a;
    }
//     public int count(int n){
//         int count = 0;
        
//         while(n>0){
//             count += n & 1;
//             n = n>>1;
//         }
//         return count;
//     }
}