class Solution {
    public List<Integer> findClosestElements(int[] a, int k, int x) {
      List<Integer> ans = new ArrayList<Integer>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((aa,b)-> aa[1]!=b[1]?b[1]-aa[1]:aa[0]-b[0]);
        for(int i:a){
            if(pq.size()==k){
                if(Math.abs(x-i)<pq.peek()[1]){
                    pq.poll();
                    pq.add(new int[]{i,Math.abs(x-i)});
                }
            }else{
                pq.add(new int[]{i,Math.abs(x-i)});
            }
        }
        int in=0;
        while(!pq.isEmpty()){
            ans.add(pq.poll()[0]);
        }
        Collections.sort(ans);
        return ans;   
    }
}