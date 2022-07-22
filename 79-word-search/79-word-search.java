class Solution {
     boolean ans = false;
    public boolean exist(char[][] b, String w) {
       
        boolean vis[][] = new boolean [b.length][b[0].length];
        ans = false;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                if(b[i][j]==w.charAt(0)){
                    solve(0,i,j,b,w,vis);
                    if(ans==true)return true;
                }
            }
        }
        return false;
    }
    public void solve(int k,int i,int j,char[][] b, String w,boolean[][] vis){
        if(i<0 || j<0 || i>=b.length || j>=b[0].length || vis[i][j]==true || b[i][j]!=w.charAt(k))return;
        // System.out.println(k);
        if(k==w.length()-1){
            ans = true;
            return;
        }
        
        vis[i][j]=true;
        
        solve(k+1,i+1,j,b,w,vis);
        solve(k+1,i,j+1,b,w,vis);
        solve(k+1,i-1,j,b,w,vis);
        solve(k+1,i,j-1,b,w,vis);
        
        vis[i][j] = false;
        
    }
}