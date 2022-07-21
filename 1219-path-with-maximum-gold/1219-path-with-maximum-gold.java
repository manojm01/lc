class Solution {
    int ans = 0;
    public int getMaximumGold(int[][] g) {
        int a[][] = new int[g.length][g[0].length];
          for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                 a[i][j]=g[i][j];
            }
        }
        int sum=0;
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                solve(i,j,g,sum);
                g=a;
            }
        }
       
         // System.out.println();
        return ans;
    }
    
    public void solve(int i,int j,int[][] g,int sum){
        
        if(i<0 || j<0 || i>=g.length || j>=g[0].length || g[i][j]==0){
            return;
        }
        int o=g[i][j];
        sum += g[i][j];
        // System.out.print(sum+" ");
        g[i][j]=0;
        ans = Math.max(ans,sum);
        
        solve(i+1,j,g,sum);
        solve(i,j+1,g,sum);
        solve(i-1,j,g,sum);
        solve(i,j-1,g,sum);
        g[i][j]=o;
    }
}