class Solution {
    public int[] kWeakestRows(int[][] a, int k) {
        int m = a.length;
        int s[] = new int[m];
        int c[] = new int[m];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<a[i].length;j++){
                s[i] += a[i][j];
            }
        }
        for(int i=0;i<m;i++)c[i]=s[i];
        for(int i=0;i<m;i++){
            for(int j=i+1;j<m;j++){
                if(s[i]>s[j]){
                    int t = s[i];
                    s[i] = s[j];
                    s[j] = t;
                }
            }
        }
        int ans[] = new int[k];
        
        for(int i=0;i<k;i++){
           for(int j=0;j<m;j++){
               if(s[i] == c[j]){
                   ans[i] = j;
                   c[j] = -1;
                   break;
               }
           }  
        }
        return ans;
    }
}