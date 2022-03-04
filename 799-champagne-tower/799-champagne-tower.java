class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double a[][] = new double[query_row+2][query_row+2];
        
        a[0][0] = (double)poured;
        
        for(int r=0;r<=query_row;r++){
            for(int c=0;c<=r;c++){
                double rem = (a[r][c]-1.0)/2.0;
                if(rem>0){
                    a[r+1][c] += rem;
                    a[r+1][c+1] += rem;
                }
            }
        }
        return Math.min(1.0,a[query_row][query_glass]);
    }
}