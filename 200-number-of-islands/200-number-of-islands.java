class Solution {
    public int numIslands(char[][] a) {
        int ans = 0;
        int n = a.length;
        int m = a[0].length;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]=='1'){
                    ans++;
                    fun(a,i,j);
                }
            }
        }
        return ans;
    }
    public void fun(char[][] a,int i,int j){
        if(i<0||j<0||i>=a.length||j>=a[0].length||a[i][j]=='0'||a[i][j]=='2')return;
        
        a[i][j]='2';
        
        fun(a,i+1,j);
        fun(a,i-1,j);
        fun(a,i,j+1);
        fun(a,i,j-1);
    }
}