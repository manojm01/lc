class Solution {
    public int[] sortedSquares(int[] a) {
        int n = a.length;
        int ans[] = new int[n];
        int i=0,j=n-1;
        
        for(int k=n-1;k>=0;k--){
            if(Math.abs(a[i])>Math.abs(a[j])){
               ans[k] = a[i]*a[i];
                i++;
            }
            else{
                ans[k] = a[j]*a[j];
                j--;
            }
        }
        return ans;
    }
}