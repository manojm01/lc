class Solution {
    public int twoCitySchedCost(int[][] a) {
        int n = a.length;
        int b[][] = new int[n][2];
        
        
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<2;j++){
//                 b[i][j] = a[i][j];
//             }
//         }
        
        // Arrays.sort(a, (p,q)->p[0]-q[0]);
        // Arrays.sort(b, (p,q)->p[1]-q[1]);
        
//         int ans = 0;
//         int ans2 = 0;
        
//         for(int i=0;i<a.length/2;i++){
//             ans += a[i][0];
//             ans2 += b[i][1];
//             // System.out.print(a[i][0]+" ");
//             a[i][0] = -1;
//             b[i][1] = -1;
//         }
        // System.out.println();
        // Arrays.sort(a, (p,q)->p[1]-q[1]);
        // int x = (n/2)+1;
        // System.out.println("x: "+x);
        // int i =0;
        
        // while(x-->0){
//             if(a[i][0]!=-1){
//                 ans += a[i][1];
//                  // System.out.print(a[i][1]+" ");
//             }
//             if(b[i][1]!=-1){
//                 ans2 += b[i][0];
                 
//             }
//             i++;
//         }
        
//         Arrays.sort(b, (p,q)->p[1]-q[1]);
        int ans = 0;
          Arrays.sort(a, (aa, bb) -> {
            return aa[0] - aa[1] - (bb[0] - bb[1]);
        });
        for(int i=0;i<a.length;i++){
                if(i<n/2)
                  ans += a[i][0];
                else ans += a[i][1];
            // System.out.println();
        }
         // System.out.print(ans+" "+ans2);
        return ans;
    }
    
}