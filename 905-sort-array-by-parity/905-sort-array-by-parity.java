class Solution {
    public int[] sortArrayByParity(int[] a) {
        int i=0;int n=a.length;
        int j=n-1;
        
        while(i<j){
            if(a[i]%2!=0 && a[j]%2==0){
                int temp = a[i];
                  a[i]=a[j];
                  a[j]=temp;
                i++;j--;
            }
            else if(a[i]%2!=0 && a[j]%2!=0){
                j--;
            }
             else if(a[i]%2==0 && a[j]%2==0){
                i++;
            }
            else{
                i++;j--;
              continue;  
            }
        }
        return a;
    }
    // static void swap(int x,int y){
    //     int temp = x;
    //     x=y;
    //     y=temp;
    // }
}