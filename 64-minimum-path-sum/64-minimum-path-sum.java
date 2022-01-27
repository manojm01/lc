class Solution {
    public int minPathSum(int[][] g) {
        int n = g.length;
        int m = g[0].length;
        
        int a[][] = new int[n][m];
        a[n-1][m-1] = g[n-1][m-1];
        
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i==n-1 && j==m-1){
                    a[i][j] = g[i][j];
                }
                else if(i==n-1){
                    a[i][j] = g[i][j] + a[i][j+1];
                }
                else if(j==m-1){
                     a[i][j] = g[i][j]+ a[i+1][j];
                 }
                else
                  a[i][j] = g[i][j] + Math.min(a[i+1][j],a[i][j+1]);
                
               // System.out.print(a[i][j]+" ");
            }
          //  System.out.println();
        }
        return a[0][0];
    }
}