class Solution {
    public int[] sumEvenAfterQueries(int[] a, int[][] q) {
        int n = q.length;
        int ans[] = new int[n];
        int in=0;
        int tot =0;
        for(int i:a)if(i%2==0)tot+=i;
        
        for(int s[]:q){
            int temp = a[s[1]];
            
            if(temp%2==0)
              tot-=temp;
            
            a[s[1]] += s[0];
            
            if(a[s[1]]%2==0){
                tot += a[s[1]];
            }
            ans[in++]=tot;
        }
        return ans;
    }
}