class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        
        int r = searchRow(a,t);
        
        int l=0;int h=a[0].length-1;
        if(r==-1)return false;
         while(l<=h){
            int mid = (l+h)/2;
            
            if(t==a[r][mid]){
                return true;
            }
            else if(t<a[r][mid]){
                h=mid-1;
            }
            else l=mid+1;
        }
        return false;
    }
    
    public int searchRow(int[][] a,int t){
        int l=0;
        int h=a.length-1;
        int n = a[0].length;
        while(l<=h){
            int mid = (l+h)/2;
            
            if(t<=a[mid][n-1] && t>=a[mid][0]){
                return mid;
            }
            else if(t<a[mid][0]){
                h=mid-1;
            }
            else l=mid+1;
        }
        return -1;
    }
}