class Solution {
    public int[][] merge(int[][] a) {
        Arrays.sort(a,(p,q)-> p[0]-q[0]);
        
        int n = a.length;

        ArrayList<int[]> l = new ArrayList<>();
        int s = a[0][0];
        int e = a[0][1];
        
        for(int i[]:a){
            if(e>=i[0]){
                e = Math.max(e,i[1]);
            }
            else{
                l.add(new int[]{s,e});
                s = i[0];
                e = i[1];
            }
        }
         l.add(new int[]{s,e});
        return l.toArray(new int[0][]);
    }
}