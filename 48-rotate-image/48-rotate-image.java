class Solution {
    public void rotate(int[][] a) {
        int n= a.length;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }    
        }
         for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int t = a[i][j];
                a[i][j] = a[i][n-j-1];
                a[i][n-j-1] = t;
            }    
        }
    }
}