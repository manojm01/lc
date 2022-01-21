class Solution {
    public int largestSumAfterKNegations(int[] a, int k) {
        
        int neg=0;
        Arrays.sort(a);
        
        for(int i:a){
            if(i<0)neg++;
        }
        int x=k;
       for(int i=0;i<neg;i++){
            if(x>0){
                a[i] = a[i]*-1;
                x--;
            }
        }
        Arrays.sort(a);
        int ans = 0;
        if(x!=0 && x%2==1){
             System.out.print(a[0]+" enetered");
            a[0] = a[0]*-1;
        }
        for(int i:a){
            System.out.print(i+" ");
            ans += i;
        }
        return ans;
    }
}