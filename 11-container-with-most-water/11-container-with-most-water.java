class Solution {
    public int maxArea(int[] a) {
        int n = a.length;
        int ans = 0;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(a[i]<a[j]){
//                     ans = Math.max(ans,(j-i)*a[i]);
                    
//                 }else{
//                     ans = Math.max(ans,(j-i)*a[j]);
//                     System.out.print(ans+" ");
//                 }
               
//             }
//         }
        int i=0;int j=n-1;
        while(i<j){
            ans = Math.max(ans,(j-i)*Math.min(a[i],a[j]));
            if(a[i]<a[j])i++;
            else j--;
        }
        return ans;
    }
}