class Solution {
    public int[][] merge(int[][] a) {
          
        ArrayList<int[]> l = new ArrayList<>();
        
        Arrays.sort(a,(p,q)->p[0]-q[0]);
        int n = a.length;
        
        int s = a[0][0];
        int e = a[0][1];
        
        for(int arr[]:a){
            if(e>=arr[0]){
                e = Math.max(e,arr[1]);
            }
            else{
                l.add(new int[]{s,e});
                s = arr[0];
                e = arr[1];
            }
        }
         l.add(new int[]{s,e});
        int[][] ans = new int[l.size()][2];
        for(int i=0;i<l.size();i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}