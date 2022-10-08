class Solution {
    public int threeSumClosest(int[] a, int t) {
        int diff = Integer.MAX_VALUE;
        int ans=0;
        int n = a.length;
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            int j=i+1;int k=n-1;
          
            while(j<k){
                int sum = a[i]+a[j]+a[k];
                //diff = Math.min(diff,Math.abs(sum-t));
                
                if(diff>Math.abs(sum-t)){
                    diff=Math.abs(sum-t);
                    ans = sum;
                }
                if(diff==0)return ans;
                else if(sum>t)k--;
                else j++;
           }
        }
        return ans;
    }
}