class Solution {
    public int numberOfArithmeticSlices(int[] a) {
        int n = a.length;
        int ans = 0;
        if(n<3)return ans;
        for(int i=0;i<n-1;i++){
            int d=a[i+1]-a[i];
            int size=1;
            for(int j=i+1;j<n;j++){
                if(a[j]-a[j-1]==d){
                    size++;
                }
                else{
                    
                    break;
                }
                            
                i=j;
            }
            i--;
            for(int k=3;k<=size;k++){
                ans += (size-k+1);
            }
        }
        return ans;
    }
}