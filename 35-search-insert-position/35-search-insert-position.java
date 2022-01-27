class Solution {
    public int searchInsert(int[] a, int t) {
        int n = a.length;
        int l = 0;
        int h = n-1;
        if(t<=a[0])return 0;
        while(l<=h){
            int mid = l+(h-l)/2;
            
            if(a[mid]==t)return mid;
            
            if(a[mid]>t)h=mid-1;
            
            if(a[mid]<t)l=mid+1;
        }
        return l;
    }
}