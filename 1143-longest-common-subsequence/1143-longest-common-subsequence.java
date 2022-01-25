class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        int a[][] = new int[n+1][m+1];
        
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0)a[i][j]=0;
            }
        }
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    a[i][j] = 1 + a[i-1][j-1];
                }
                else{
                    a[i][j] = Math.max(a[i][j-1],a[i-1][j]);
                }
            }
        }
        
        return a[n][m];
    }
}