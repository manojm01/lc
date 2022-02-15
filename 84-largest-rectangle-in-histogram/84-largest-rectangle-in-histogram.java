class Solution {
    public int largestRectangleArea(int[] a) {
        int ans = 0;
        int n = a.length;
        int r[] = new int[n];  // nearest smaller on right
        int l[] = new int[n];  // nearest smaller on left
        Stack<Integer> rs = new Stack<>();
        rs.push(n-1);
        r[n-1] = n;
        
        for(int i=n-2;i>=0;i--){
            while(rs.size()>0 && a[i]<=a[rs.peek()]){
                rs.pop();
            }
            if(rs.size()==0)r[i] = n;
            else r[i] = rs.peek();
            rs.push(i);
        }
            
        Stack<Integer> ls = new Stack<>();
        ls.push(0);
        l[0] = -1;
        
        for(int i=1;i<n;i++){
            while(ls.size()>0 && a[i]<=a[ls.peek()]){
                ls.pop();
            }
            if(ls.size()==0)l[i] = -1;
            else l[i] = ls.peek();
            ls.push(i);
        }
               
        for(int i=0;i<n;i++){
            int width = r[i]-l[i]-1;
            ans = Math.max(ans,width*a[i]);
        }
        
        return ans;
        
    }
    
        //   for(int i=0;i<n;i++){
        //     int sum = 0;
        //     int min = a[i];
        //     for(int j=i;j<n;j++){
        //         min = Math.min(a[j],min);
        //         sum = min*(j-i+1);
        //         ans = Math.max(ans,sum);
        //     }
        // }
}