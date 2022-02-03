class Solution {
    public String longestPalindrome(String s)
    {
        char c[] = s.toCharArray();
        int n = s.length();
        int dp[][] = new int[n][n];;
        int start = 0;
        int maxL=1;
        String ans = "0";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(i==j)dp[i][j]=1;
                if(j==i+1 && c[i]==c[j]){
                    dp[i][j]=1;
                    start = i;
                    maxL=2;
                }
                
            }
        }
       for(int k=3;k<=n;k++){
            for(int i=0;i<n-k+1;i++){
                int j = i+k-1;
                if(c[i]==c[j] && dp[i+1][j-1]==1){
                    dp[i][j]=1;
                    if(k>maxL){
                        maxL = k;
                        start = i;
                    }
                }
            }
        }
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print(dp[i][j]+" ");
//             }
//             System.out.println();
//         }
        
        return s.substring(start,start+maxL);
    }
    
}