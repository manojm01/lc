class Solution {
    public int candy(int[] a) {
        int n = a.length;
        int c[] = new int[n];
        int ans = 0;
        
        for(int i=0;i<n;i++)c[i]=1;
        for(int i=1;i<n;i++){
            if(a[i]>a[i-1]){
                c[i] = c[i-1]+1;
            }
        
            // else if(a[i]==a[i-1]){
            //     if(c[i-1]==1)c[i] = 2;
            //     else c[i]=1;
            // }
            // else{
            //     if(c[i-1]!=1){
            //         c[i] = 1;
            //     }
            //     else{
            //         int j = i;
            //         while(j>=1 && c[j-1]==c[j]){
            //             c[j-1]++;
            //             j--;
            //         }
            //         //  if(a[i]==a[i-1] && a[i]>a[i+1] && c[i-1]-1==c[i])c[i-1]=c[i];
            //      }
            // }
        }
        for(int i=n-2;i>=0;i--){
            if(a[i]>a[i+1]){
                c[i] = Math.max(c[i],c[i+1]+1);
            }
        }
        for(int i:c){
            // System.out.print(i+" ");
            ans+=i;
        } 
        // System.out.println();
        return ans;
    }
}