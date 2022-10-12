class Solution {
    public int largestPerimeter(int[] a) {
        Arrays.sort(a);
        int ans = 0;
        int n=a.length;
        for(int i=n;i>=3;i--)
        if(a[i-3]+a[i-2]>a[i-1]){
           return a[i-3]+a[i-2]+a[i-1];
        }
        return 0;
    }
}