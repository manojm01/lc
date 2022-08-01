class Solution {
    public int orangesRotting(int[][] a) {
        int ans = 0;
        int n = a.length;
        int m = a[0].length;
      
        int fresh = 0;
        Queue<int[]> q = new LinkedList<>();
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==2){
                    q.add(new int[]{i,j});
                }
                if(a[i][j]==1)
                  fresh++;
            }
        }
        if(fresh==0)return 0;
        int x[] = {1,-1,0,0};
        int y[] = {0,0,1,-1};
        
        int cnt = 0;
        while(!q.isEmpty()){
            int s = q.size();
            while(s-->0){
                int cur[] = q.poll();
                
                for(int i=0;i<4;i++){
                    int xx = cur[0]+x[i];
                    int yy = cur[1]+y[i];
                    
                    if(xx<0||yy<0||xx>=n ||yy>=m||a[xx][yy]==0||a[xx][yy]==2)continue;
                    
                    a[xx][yy]=2;
                    fresh--;
                    q.add(new int[]{xx,yy}); 
                }
            }
            ans++;
            
        }
         // System.out.println(cnt+" "+tot);
        return fresh==0?ans-1:-1;
    }
   
}