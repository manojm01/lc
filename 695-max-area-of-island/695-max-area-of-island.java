class Solution {
    public int maxAreaOfIsland(int[][] g) {
        int m = g.length;
        int n = g[0].length;
        int ans = 0;
        for(int i=0;i<m;i++){
            
            for(int j=0;j<n;j++){
                if(g[i][j]==1){
                    ans = Math.max(ans,dfs(g,i,j));
                }
            }
        }
        return ans;
    }
    
    public int dfs(int[][] g,int i,int j){
        if(i<g.length && j<g[0].length && i>=0 && j>=0 && g[i][j]==1){
            g[i][j]=0;
            return 1+dfs(g,i-1,j)+dfs(g,i,j-1)+dfs(g,i+1,j)+dfs(g,i,j+1);
        }
        return 0;
    }
}