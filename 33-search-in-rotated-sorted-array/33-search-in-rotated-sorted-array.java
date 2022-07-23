class Solution {
    public int search(int[] a, int t) {
        int n = a.length;
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int mid = (high+low)/2;
            
            if(a[mid]==t)return mid;
            
            else if(a[mid]>=a[low]){
                if(a[low]<=t && t<a[mid]){
                    high=mid-1;
                }
                else{
                    low = mid+1;
                }
            }
            else{
                  if(a[mid]<t && t<=a[high]){
                    low = mid+1;
                }
                else{
                    high=mid-1;
                       
                }
            }
        }
        return -1;
    }
}