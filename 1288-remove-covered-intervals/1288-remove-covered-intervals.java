class Solution {
    public int removeCoveredIntervals(int[][] a) {
         int c=a.length;
         int n=a.length;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<n;j++){
                if(i==j)continue;
                
                if(a[i][0]>=a[j][0] && a[i][1]<=a[j][1]){
                    c--;break;
                }
                
            }
        }
        return c;
    }
}