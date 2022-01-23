class Solution {
    public int countElements(int[] a) {
        int ans = 0;
        int max = a[0];
        int min = a[0];
        for(int i:a){
            max = Math.max(i,max);
            min = Math.min(i,min);
        }
        for(int i:a){
            if(i>min && i<max)ans++;
        }
        return ans;
    }
}

// Arrays.sort(a);
//         int ans=0;
//         int i=1;
//         int j=n-1;
//          if(n<=2)return 0;
//         while(i<n && a[i]==a[i-1])i++;
//         while(j>0 && a[j]==a[j-1])j--;
//         if(i==n || j==-1)return 0;

//         for(int k=i;k<j;k++){
//             if(a[k]>a[k-1]){
//                 while(k<n && a[k]==a[k+1]){
//                     k++;
//                     ans++; 
//                 }
//                 if(a[k]<a[k+1]){
//                    ans++; 
//                 }
//             }
//         }
//         if(n<=2)return 0;