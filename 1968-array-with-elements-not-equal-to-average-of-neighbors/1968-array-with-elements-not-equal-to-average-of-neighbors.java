class Solution {
    public int[] rearrangeArray(int[] a) {
        int n = a.length;
        int ans[] = new int[n];
        
        Arrays.sort(a);
        for(int i=1;i<n;i+=2){
            ans[i] = a[i-1];
            ans[i-1] = a[i];
        }
        if(n%2==1)ans[n-1]=a[n-1];
        return ans;
    }
    
}

  // for(int i=1;i<n-1;i++){
//             if(a[i]!=0 && (a[i-1]+a[i+1])/2 == a[i] && (a[i-1]+a[i+1]-1)/2 != a[i]){
//                 int t = a[i];
//                 a[i] = a[i+1];
//                 a[i+1] = t;
                 
//                 if(i==n-2)ans[n-1]=t;
                
//             }
//             ans[i] = a[i];
//         }