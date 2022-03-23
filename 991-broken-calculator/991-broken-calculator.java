class Solution {
    public int brokenCalc(int s, int t) {
        int ans = 0;
        
        while(t>s){
            if(t%2==0){
               t/=2;
            }
            else{
                t++;
            }
            ans++;
        }
        return ans+s-t;
    }
}