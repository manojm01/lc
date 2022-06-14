class Solution {
    public void setZeroes(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        //   for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[0].length; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        boolean checkR=false;
        boolean checkC=false;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]==0){
                    if(i==0)checkR=true;
                    if(j==0)checkC=true;
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }
         for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(a[i][0]==0 || a[0][j]==0){
                   a[i][j]=0;
                }
            }
        }
        if(checkR){
            for(int i=0;i<m;i++){
                a[0][i]=0;
            }
        }
        if(checkC){
            for(int i=0;i<n;i++){
                a[i][0]=0;
            }
        }
        
        
        // System.out.println("-------");
        //  for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[0].length; j++) {
        //         System.out.print(a[i][j] + " ");
        //     }
        //     System.out.println();
        // }
    }
}

// class Solution {
//     public void setZeroes(int[][] a) {
//         ArrayList<Integer> r = new ArrayList<>();
//         ArrayList<Integer> c = new ArrayList<>();
        
//         for(int i=0;i<a.length;i++){
//             for(int j=0;j<a[0].length;j++){
//                 if(a[i][j]==0){
//                     if(!r.contains(i))r.add(i);
//                     if(!c.contains(j))c.add(j);
//                 }
//             }
//         }

//         for(int i:r){
//             solve_r(a,i);
//         }
//         for(int i:c){
//             solve_c(a,i);
//         }
//     }
//     public void solve_r(int[][] a,int r){
//         for(int j=0;j<a[0].length;j++){
//             a[r][j]=0;
//         }
//     }
//     public void solve_c(int[][] a,int c){
//         for(int j=0;j<a.length;j++){
//             a[j][c]=0;
//         }
//     }
// }