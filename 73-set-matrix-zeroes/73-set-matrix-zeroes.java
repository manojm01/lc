class Solution {
    public void setZeroes(int[][] a) {
        ArrayList<Integer> r = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    if(!r.contains(i))r.add(i);
                    if(!c.contains(j))c.add(j);
                }
            }
        }

        for(int i:r){
            solve_r(a,i);
        }
        for(int i:c){
            solve_c(a,i);
        }
    }
    public void solve_r(int[][] a,int r){
        for(int j=0;j<a[0].length;j++){
            a[r][j]=0;
        }
    }
    public void solve_c(int[][] a,int c){
        for(int j=0;j<a.length;j++){
            a[j][c]=0;
        }
    }
}