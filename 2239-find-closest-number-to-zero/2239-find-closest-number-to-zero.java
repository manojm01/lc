class Solution {
    public int findClosestNumber(int[] a) {
        int diff = Integer.MAX_VALUE;
        int ans = a[0];
        
        for(int i:a){
            if(Math.abs(i)<=diff){
                if(i==-1*ans)ans = Math.abs(i);
                else ans=i;
                diff = Math.abs(i);
            }
        }
        return ans;
    }
}