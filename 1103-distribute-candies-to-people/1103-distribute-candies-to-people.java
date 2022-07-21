class Solution {
    public int[] distributeCandies(int c, int n) {
        ArrayList<Integer> l = new ArrayList<>();
        int ans[] = new int[n];
        int curr = 1;
        int tot = 0;
        
       while(tot+curr<c){
           if(tot>c)break;
            l.add(curr);
            tot += curr;
            curr++;    
        }
        l.add(c-tot);
         
        for(int i=0;i<n;i++){
            int j=i;
            for(j=i;j<l.size();){
                ans[i] += l.get(j);
                j += n;
            }
        }   
        return ans;
    }
}