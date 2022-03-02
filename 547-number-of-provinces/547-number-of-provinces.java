class Solution {
    public int findCircleNum(int[][] a) {
        int n = a.length;
        
        int vis[] = new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(vis[i]==0){
                c++;
                dfs(i,a,vis);
            }
        }
        return c;
    }
    public void dfs(int i, int a[][],int vis[]){
        for(int j=0;j<a.length;j++){
            if(a[i][j]==1 && vis[j]==0){
                vis[j]=1;
                dfs(j,a,vis);
            }
        }
    }
}