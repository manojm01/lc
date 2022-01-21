class Solution {
    public int canCompleteCircuit(int[] g, int[] c) {
        
        int tg=0;
        int tc=0;
        int total = 0;
        int ans=0;
        for(int i=0;i<g.length;i++){
            tg+=g[i];
            tc+=c[i];
            total += (g[i]-c[i]);
            if(total<0){
                ans=i+1;
                total=0;
            }
        }
        if(tg>=tc)return ans;
        return -1;
    }
}