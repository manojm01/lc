class Solution {
    public boolean isBipartite(int[][] g) {
        int n = g.length;
        int a[] = new int[n];  // color[]
        Arrays.fill(a,-1);
        
        for(int i=0;i<n;i++){
            if(a[i]==-1){
                if(!bfs(i,a,g)){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean bfs(int node,int a[],int[][] g){
         Queue<Integer> q = new LinkedList<>();
        
        q.add(node);
        a[node]=1;
        
        while(!q.isEmpty()){
            int main = q.poll();
            for(int i:g[main]){
                if(a[i]==-1){
                    a[i] = 1-a[main];
                    q.add(i);
                }
                else if(a[i]==a[main]){
                    return false;
                }
            }
        }
        return true;
    }
}