class Solution {
    public void sortColors(int[] a) {
        int z=0,o=0,t=a.length-1;
        
        while(o<=t){
            if(a[o]==0){
               swap(z,o,a);
                z++;o++;
            }
            else if(a[o]==2){
               swap(t,o,a);
                t--;
            }
            else 
             o++;
        }
    }
    public void swap(int i,int j,int[] a){
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}