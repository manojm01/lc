class Solution {
    public int[] findErrorNums(int[] a) {
        int ans[] = new int[2];
        // Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            int x = Math.abs(a[i]);
            if(a[x-1]<0){ans[0] = x;}
            else a[x-1] = -1*a[x-1];
        }
        for(int i=0;i<a.length;i++)
        {   
            // System.out.print(a[i]+" ");
            if(a[i]>0)ans[1]=i+1;
        }
        return ans;
    }
}