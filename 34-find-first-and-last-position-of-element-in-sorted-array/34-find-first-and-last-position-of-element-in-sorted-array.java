class Solution {
    public int[] searchRange(int[] a, int t) {
        int s =0 ;
        int e = a.length-1;
        int x = 0;
        int ans[] = new int[2];
        ans[0]=-1;
        ans[1]=-1;
        while(s<=e){                   // find first occurance
            int m =s+(e-s)/2;
            
            if(a[m]==t){
                ans[0]=m;             // store first occurance
                e = m-1;
            }
            
            else if(a[m]>t){
                e = m-1;
            }
            else s = m+1;
        } 
        s=0;
        e= a.length-1;
        
         while(s<=e){            // find last occurance
            int m =s+(e-s)/2;
            
            if(a[m]==t){
                ans[1]=m;           // store last occurance
                s = m+1;
            }
            
            else if(a[m]>t){
                e = m-1;
            }
            else s = m+1;
        }
        return ans;
    }
}