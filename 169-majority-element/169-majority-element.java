class Solution {
    public int majorityElement(int[] a) {
        int n = a.length;
        int maj = a[0];
        int c = 1;
        
        for(int i=1;i<n;i++){
            if(maj==a[i]){
                c++;
            }else{
                c--;
            }
            if(c==0){
                maj=a[i];
                c=1;
            }
        }
        return maj;
    }
}