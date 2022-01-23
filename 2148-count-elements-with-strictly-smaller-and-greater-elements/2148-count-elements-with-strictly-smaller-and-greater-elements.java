class Solution {
    public int countElements(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        int ans=0;
        int i=1;
        int j=n-1;
         if(n<=2)return 0;
        while(i<n && a[i]==a[i-1])i++;
        while(j>0 && a[j]==a[j-1])j--;
        if(i==n || j==-1)return 0;
        System.out.println(a[i]);
        System.out.println(a[j]);
        
        for(int k=i;k<j;k++){
            if(a[k]>a[k-1]){
                while(k<n && a[k]==a[k+1]){
                    k++;
                    
                    ans++; 
                    // if(j==n-1)return 0;
                }
                // if(j==n-1)return 0;
                if(a[k]<a[k+1]){
                   ans++; 
                }
                
            }
        }
        if(n<=2)return 0;
        return ans;
    }
}