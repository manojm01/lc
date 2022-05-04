class Solution {
    public int longestOnes(int[] a, int k) {
        int sum=0,ans=0;
        int n = a.length;
        int z = 0;
        int start = 0;
        
        for(int end=0;end<n;end++){
           if(a[end]==0)z++;
            
            while(z>k){
                if(a[start]==0)z--;
                start++;
            }
            
            ans = Math.max(ans,end-start+1);
        }
        
        return ans;
    }
}