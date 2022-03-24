class Solution {
    public int numRescueBoats(int[] p, int l) {
        int n = p.length;
        int ans = 0;
        Arrays.sort(p);
        int i=0,j=n-1;
        
        while(i<=j){
            if(p[i]+p[j]<=l){
                i++;
                j--;
            }else{
                j--;
            }
            ans++;
        }
        return ans;
    }
}