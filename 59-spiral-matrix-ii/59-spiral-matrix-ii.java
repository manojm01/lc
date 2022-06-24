class Solution {
    public int[][] generateMatrix(int n) {
        int ans[][] = new int[n][n];
           
        int rb=0,re=n-1,cb=0,ce=n-1;
        int c=1;
        while(rb<=re && cb<=ce){
            for(int i=cb;i<=ce;i++){
                ans[rb][i] = c;
                c++;
            }
            rb++;
            for(int i=rb;i<=re;i++){
                ans[i][ce] = c;
                c++;
            }
            ce--;
            
            if(rb<=re)
            for(int i=ce;i>=cb;i--){
                ans[re][i] = c;
                c++;
            }
            re--;
            
            if(cb<=ce)
            for(int i=re;i>=rb;i--){
                ans[i][cb] = c;
                c++;
            }
            cb++;
        }
        
        return ans;
    }
}